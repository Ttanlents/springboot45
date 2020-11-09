package com.yjf.controller;
import com.yjf.entity.User;
import com.yjf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author 余俊锋
 * @date 2020/10/21 10:38
 * @Description
 */
@Controller
public class UserController {
  @Autowired
    UserService userService;
    @GetMapping("/hello")
  public String hello(Model model,Integer id) {
        User user = userService.getUser(id);
        model.addAttribute("user",user);
      return "index2";
  }
}
