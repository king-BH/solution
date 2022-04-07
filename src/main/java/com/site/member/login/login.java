package com.site.member.login;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class login {

    // 로그인 노드
    @RequestMapping(value="/loginNode", method=RequestMethod.GET)
    public String loginNode() {
        return "/member/login";
    }
    
    @RequestMapping(value="/loginForm", method=RequestMethod.POST)
    public String loginForm(@RequestParam Map<String,Object> param, BindingResult bindingResult) {
        
        System.out.println("login start");
        
        System.out.println("id ==>" + param.get("id"));
        System.out.println("password ==>" + param.get("password"));
        
        return "/member/memberMenu";
    }
    
    
    
}
