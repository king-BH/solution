package com.site.member.signUp;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class signUp {
    
    @Autowired
    signUpService signUp;
    
    // 회원가입 노드
    @RequestMapping(value="/signUpNode", method=RequestMethod.GET)
    public String signUpNode(Model model) {
        signUpForm form = new signUpForm();
        model.addAttribute("signUpForm",form);
        return "member/signUp";
    }
    
    // 회원가입 액션
    @RequestMapping(value="/signUp_action", method=RequestMethod.POST)
    public String signUp_action(@Valid signUpForm form , BindingResult bindingResult, Model model) {
        System.out.println("signUp start");
        
        if(bindingResult.hasErrors()) {
           System.out.println("signUp error");
           model.addAttribute("signUpForm",form);
           return "member/signUp";
        }      
        
        signUp.signUp_action(form);
                
        return "/member/memberMenu";
    }
    
}
