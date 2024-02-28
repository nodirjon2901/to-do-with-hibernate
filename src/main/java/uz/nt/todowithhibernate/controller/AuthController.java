package uz.nt.todowithhibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.nt.todowithhibernate.entity.UserEntity;
import uz.nt.todowithhibernate.service.UserService;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/sign-up")
    public String signUpPage() {
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String signUp(
            @ModelAttribute UserEntity user
    ) {
        userService.save(user);
        return "index";
    }

    @GetMapping("/sign-in")
    public String signInPage(){
        return "sign-in";
    }

    @PostMapping("/sign-in")
    public String signIn(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ){
        UserEntity login = userService.login(username, password);
//        model.addAttribute("ownerId",login.getId());
//        return "to-do";
        model.addAttribute("owner",login);
        return "menu";
    }

}
