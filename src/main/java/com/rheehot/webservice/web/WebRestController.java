package com.rheehot.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rheehot@gmail.com on 2018-11-16
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
