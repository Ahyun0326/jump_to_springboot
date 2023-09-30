package com.mysite.sbb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "index";
    }
}
