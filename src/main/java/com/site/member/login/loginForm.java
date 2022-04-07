package com.site.member.login;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class loginForm {

    @NotEmpty
    private String id;
    
    @NotEmpty
    private String password;
}
