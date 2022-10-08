package by.nhs.controller;

import by.nhs.entity.User;
import by.nhs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/registration")
    public String registration(Model model) {
    model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(User user,  HttpSession session) {
        if (user.getUsername() != null) {
            userService.save(user);
            session.setAttribute("user", user);
            return ("s");
        } else {

            return "redirect:/";
        }
//        return "s";
    }




}