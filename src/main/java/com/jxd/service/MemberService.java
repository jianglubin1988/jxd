package com.jxd.service;

import com.jxd.entity.Member;

import java.util.List;

public interface MemberService {

    public void insert(Member member);

    public List<Member> getAll();

}
