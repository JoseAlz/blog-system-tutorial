package pl.stefanprogramuje.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.stefanprogramuje.blog.forms.LoginForm;
import pl.stefanprogramuje.blog.service.NotificationService;
import pl.stefanprogramuje.blog.service.UserService;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("users/login")
    public String login(LoginForm loginForm) {
        return "users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            notificationService.addErrorMessage("Please fill the form correctly!");
            return "/users/login";
        }

//        if(!userService.authenticate(loginForm.getUsername(), loginForm.getPassword())) {
//            notificationService.addErrorMessage("Invalid login!");
//            return "/users/login";
//        }

        notificationService.addInfoMessage("Login successfull");
        return "redirect:/";
    }
}
