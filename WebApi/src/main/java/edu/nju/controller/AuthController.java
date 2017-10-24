package edu.nju.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mazhangchi on 2017/10/24.
 */
@RestController
@RequestMapping("/auth")
@Api("用户身份认证相关api")
public class AuthController {


    @ApiOperation("登陆入口")
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String doLogin(){
        return "login success";
    }

}
