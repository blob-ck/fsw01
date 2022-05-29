package com.donkey.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        //mustache view resolver base path : /src/main/resources/templates/*.mustache
        return "index";
    }

}
