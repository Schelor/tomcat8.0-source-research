package com.fdx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld{

    @ResponseBody
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "{\"key\":\"value\"}";
    }
}
