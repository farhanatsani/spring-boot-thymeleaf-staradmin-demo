package com.farhan.staradmin.mapper;

import com.farhan.staradmin.model.UserSample;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface UserSampleMapper {
    @Select("select id, family_name, first_name, family_kana_name, first_kana_name, birthday, gender, office, tel, mail, is_quit, created_at, updated_at from user_sample")
    ArrayList<UserSample> find();

=======
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserSampleMapper {
    @Select("SELECT * FROM user_sample")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "familyName", column = "family_name"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "familyKanaName", column = "family_kana_name"),
            @Result(property = "firstKanaName", column = "first_kana_name"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "office", column = "office"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "mail", column = "mail"),
            @Result(property = "isQuit", column = "is_quit"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at")
    })
    List<UserSample> selectAllUsers();

    @Select("SELECT * FROM user_sample WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "familyName", column = "family_name"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "familyKanaName", column = "family_kana_name"),
            @Result(property = "firstKanaName", column = "first_kana_name"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "office", column = "office"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "mail", column = "mail"),
            @Result(property = "isQuit", column = "is_quit"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at")
    })
    UserSample selectOneUserById(Long id);

    // insertUser

    @Update("UPDATE user_sample SET "
            + "family_name = #{familyName}, "
            + "first_name = #{firstName}, "
            + "family_kana_name = #{familyKanaName}, "
            + "first_kana_name = #{firstKanaName}, "
            + "birthday = #{birthday}, "
            + "gender = #{gender}, "
            + "office = #{office}, "
            + "tel = #{tel}, "
            + "mail = #{mail}, "
            + "is_quit = #{isQuit}, "
            + "updated_at = #{updatedAt} "
            + "WHERE id = #{id}")
    void updateUser(UserSample userSample);

    @Delete("DELETE FROM user_sample WHERE id = #{id}")
    void deleteUserById(Long id);
>>>>>>> origin/jhg/user_fix_popup
}
