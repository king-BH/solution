package com.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sampleNode {

    // 사용자 메뉴 노드
    @RequestMapping("/memberMenuNode")
    public String memberMenuNode() {
        return "/member/memberMenu";
    }
    
}
