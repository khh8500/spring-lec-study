package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@RestController // 리턴 시에 그 문자를 그대로 응답
@Controller // 리턴 시에 파일 응답, 파일명이어야 함, 포워드, 템플릿 엔진
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm () {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

        if (username.length() > 10) {
            return "error-404";
        }

        return "redirect:/main";
    }
}
