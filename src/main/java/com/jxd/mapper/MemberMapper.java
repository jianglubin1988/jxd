package com.jxd.mapper;

import com.jxd.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO t_member (id, cardno, name, birthdate, tel, gender, crtdate, remark) VALUES (#{id}, #{cardno}, #{name}, #{birthdate}, #{tel}, #{gender}, #{crtdate}, #{remark})")
    public void insert(Member member);
}
