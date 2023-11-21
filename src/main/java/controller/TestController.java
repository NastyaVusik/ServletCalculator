package controller;

import jdk.incubator.vector.VectorOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(Model model){
        model.addAttribute("myName", "Test");
        return "test";

    }
}