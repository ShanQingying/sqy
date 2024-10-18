package org.example.studyweb.Controller;


import lombok.extern.slf4j.Slf4j;
import org.example.studyweb.pojo.Result;
import org.example.studyweb.pojo.User;
import org.example.studyweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.studyweb.StudywebApplication.globalUser;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/show")
    public Result findAll() {
        log.info("用户列表");

        List<User> users=userService.findAll();
        return Result.success(users);
    }


    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        log.info("用户注册");
        if(userService.register(user)) {
            log.info("注册成功");

            userService.save(user);
            return Result.success();
        }
        else return Result.error("用户名已存在");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        log.info("用户登录");
        if(userService.login(user)) {
            log.info("登陆成功");
            globalUser=user;
            return Result.success();

        }
        else return Result.error("用户名或者密码错误");

    }

    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        log.info("信息更新");
        userService.update(user);
        globalUser=user;
        return Result.success();
    }

    @GetMapping("/getstate")
    public Boolean getState() {
        log.info(globalUser.toString());
        return globalUser.getState();
    }

    @PostMapping("/updatestate")
    public Result updateState() {
        if(globalUser.getUsername()==null) {
            return Result.error("请先登录");
        }
        else {
            globalUser.setState(true);
            return update(globalUser);
        }
    }

}
