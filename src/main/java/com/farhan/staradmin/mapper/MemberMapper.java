package com.farhan.staradmin.mapper;

import com.farhan.staradmin.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM member")
    ArrayList<Member> find();

}
