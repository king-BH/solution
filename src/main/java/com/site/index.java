package com.site;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {
    
    @RequestMapping("/")
    public String home() {
        return "index"; // 해당 경로의 템플릿으로 이동함
    }
    
}
