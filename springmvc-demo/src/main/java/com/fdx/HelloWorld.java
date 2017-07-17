package com.fdx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloWorld{

    @ResponseBody
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.getAttribute("userId");
        return "{\"key\":\"value\"}";
    }
}
