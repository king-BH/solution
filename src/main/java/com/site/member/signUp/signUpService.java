package com.site.member.signUp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
public class signUpService {
    
    @Autowired
    private signUpMapper mapper;
    
    public Map<String,Object> signUp_action(signUpForm form) {
        System.out.println("form.getId() ==>" + form.getId());
        
        /* id 유효성 검사 */
        // 1. 아이디 존재 여부
        int idCheck = mapper.signUpIdcheck(form.getId());
        
        
        return null;
    }
}