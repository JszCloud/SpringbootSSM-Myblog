package cn.name.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nominal on 2018/1/10 0010.
 * 微博：@李明易DY
 */
@Controller
public class ViewController {
    @RequestMapping("json")
    public String json(){
        return "/view/home";
    }
}
