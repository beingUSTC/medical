package com.yang.medical.controller;

import com.yang.medical.entity.Result;
import com.yang.medical.entity.User;
import com.yang.medical.service.MessageService;
import com.yang.medical.service.UserService;
//import com.yang.medical.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class userController {
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    @RequestMapping("/login")
    public Result login(HttpServletResponse response, @RequestParam("username") String name,
                        @RequestParam("password") String password){
        Result result = new Result(200);
        User user = userService.userLogin(name,password);
        if(user!=null){
//            token = TokenUtil.sign(user);
            Map<String,Object> map = new HashMap<>();
            map.put("mess","登录成功");
            map.put("rid",user.getID());
            result.setData(map);
        }else {
            result.setCode(400);
            result.setData("登录失败");
        }
        Cookie cookie=new Cookie("rid",""+user.getID());
        response.addCookie(cookie);

        return result;
    }

    @RequestMapping("/getRecord")
    public Result get( @RequestParam("rid") String rid){
        Result result = messageService.get(Integer.parseInt(rid));
        return result;
    }

    @RequestMapping("/addNotify")
    public Result Notify(@RequestParam("rid") String rid,@RequestParam("Message") String Message){
        Result result = new Result(200);
        messageService.add(Integer.parseInt(rid),Message);
        return result;
    }
}
