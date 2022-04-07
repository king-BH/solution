package com.site.member.signUp;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface signUpMapper {

    int signUpIdcheck(String member_id);
    
}
