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
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;



    @GetMapping()
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/users")
    public String home(@ModelAttribute("user") User user, HttpSession session) {
        User userFromMemory = userService.findByUsername(user.getUsername());
        if (userFromMemory != null) {
            if (userFromMemory.getPassword().equals(user.getPassword())) {
                session.setAttribute("user", userFromMemory);
                return "s";
            } else {

                return "home";
            }
        } else {

            return "home";
        }
    }
}
