package com.site.sale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class salePageNode {
    
    @RequestMapping("/saleMenuNode")
    public String saleMenuNode() {
        return "/sale/saleMenu";
    }
    
}
