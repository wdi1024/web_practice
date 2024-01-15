package com.example.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "대인");
        return "greetings"; // templates/greetings.mustache 찾아서 브라우저로 전송
    }
    @GetMapping("/bye")
    public  String seeYouNextTime(Model model){
        model.addAttribute("nickname", "대인");
        return "goodbye";
    }
}
