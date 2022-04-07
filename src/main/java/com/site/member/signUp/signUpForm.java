package com.site.member.signUp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Data;

@Data
public class signUpForm {
    
    @Email(message = "이메일 형식으로 입력하세요")
    @NotBlank(message = "필수 입력값입니다.")
    private String id;
    
    @NotBlank(message = "필수 입력값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,32}", message = "형식에 맞게 입력해주세요 입력값입니다.")
    private String password;
    
    @NotBlank(message = "필수 입력값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,32}", message = "형식에 맞게 입력해주세요 입력값입니다.")
    private String confirm_password;
    
    @NotBlank(message = "필수 입력값입니다.")
    private String phone;
    
    @NotBlank(message = "휴대폰 인증이 필요합니다.")
    private String certification_yn;
    
    @NotBlank(message = "필수 입력값입니다.")
    private String name;
    
    
}
