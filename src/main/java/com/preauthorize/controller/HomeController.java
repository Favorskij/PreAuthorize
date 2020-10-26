package com.preauthorize.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @ResponseBody
    @GetMapping("/")
    public String home () {
        return "Go " + " <a href=\"/user\"><button type=\"submit\" >User</button></a>";
    }

//    @PreAuthorize("principal.username == 'user'")
    @PreAuthorize("isAuthenticated()")
//    @Secured("ROLE_USER")
    @ResponseBody
    @GetMapping(value = "/user")
    public String user () {
        return "";
    }


}
