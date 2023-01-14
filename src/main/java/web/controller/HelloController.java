package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Controller

public class HelloController {
    @GetMapping("/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("This is a task 2.3.1 KATA Academy");
        messages.add("Made by Nick");
        model.addAttribute("messages", messages);
        return "index";
    }
}
