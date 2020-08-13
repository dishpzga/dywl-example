package com.dywl.example.controller;

import com.dywl.example.model.entity.UserEntity;
import com.dywl.example.model.vo.LoginVo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("login")
    public String loginView(Model model) {
        model.addAttribute("name", "my name is harry");
        return "login";
    }

    @GetMapping("detail")
    public String detailView() {
        return "detail";
    }

    @PostMapping("login")
    public ResponseEntity<LoginVo> login(String userName, String password) {

//        spring
//        spring boot
//        spring-boot-jpa

//        ajax
//        json
//        html
//        javascript
        return ResponseEntity.ok(new LoginVo());
    }

    @PostMapping("create")
    public ResponseEntity create(UserEntity entity) {
        return ResponseEntity.ok("待实现");
    }

    @PostMapping("update")
    public ResponseEntity update(UserEntity entity) {
        return ResponseEntity.ok("待实现");
    }

    @PostMapping("delete")
    public ResponseEntity delete(UserEntity entity) {
        return ResponseEntity.ok("待实现");
    }
}
