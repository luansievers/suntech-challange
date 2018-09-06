package com.suntech.project.controller;

import com.suntech.project.model.User;
import com.suntech.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/filter")
//    public List<User> filter(@RequestParam(value="user") User user){
//        return this.userService.findAllUsersBy(user);
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getHome() {

        ModelAndView model = new ModelAndView("index", "user", new User());
        model.addObject("userList", this.userService.findAllUsers());

        return model;
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public ModelAndView doFilter(@ModelAttribute("user")User user) {

        ModelAndView model = new ModelAndView("index", "user", user);
        model.addObject("userList", this.userService.findAllUsersBy(user));

        return model;
    }

}
