package com.jxd.mapper;

import com.jxd.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO t_member (id, cardno, name, birthdate, tel, gender, crtdate, remark) VALUES (#{id}, #{cardno}, #{name}, #{birthdate}, #{tel}, #{gender}, #{crtdate}, #{remark})")
    public void insert(Member member);

    @Select("select * from t_member")
    public List<Member> getAll();
}
