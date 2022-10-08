package by.nhs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/s")
@RequiredArgsConstructor
public class Controller {

    @GetMapping
    public String s(Model model) {

        return "s";
    }
}

