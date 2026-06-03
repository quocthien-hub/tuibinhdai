package pro.tuibinhdai.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/binhdai")
public class MyController {

    @GetMapping
    public String index(){
        return "index";
    }
}
