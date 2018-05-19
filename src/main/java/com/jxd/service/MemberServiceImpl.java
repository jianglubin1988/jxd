package com.jxd.service;

import com.jxd.entity.Member;
import com.jxd.entity.User;
import com.jxd.mapper.MemberMapper;
import com.jxd.mapper.UserMapper;
import com.jxd.utils.CommonUtils;
import com.jxd.utils.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper mapper;

    @Transactional
    public void insert(Member member) {
        member.setCrtdate(DateUtils.getCurrentTime());
        member.setCardno(CommonUtils.getCardno());
        mapper.insert(member);
    }
}
