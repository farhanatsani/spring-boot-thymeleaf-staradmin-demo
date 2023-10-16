package com.farhan.staradmin.mapper;

import com.farhan.staradmin.model.UserSample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface UserSampleMapper {
    @Select("select id, family_name, first_name, family_kana_name, first_kana_name, birthday, gender, office, tel, mail, is_quit, created_at, updated_at from user_sample")
    ArrayList<UserSample> find();

}
