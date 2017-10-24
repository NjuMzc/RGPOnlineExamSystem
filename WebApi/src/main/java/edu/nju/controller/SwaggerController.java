package edu.nju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mazhangchi on 2017/10/24.
 */
@Controller
public class SwaggerController {

    @RequestMapping("/swagger")
    public String getSwagger(){
        return "index";
    }
}
