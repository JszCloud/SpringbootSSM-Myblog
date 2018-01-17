package cn.name.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

/**
 * Created by Nominal on 2018/1/10 0010.
 * 微博：@李明易DY
 */
@Controller
@RequestMapping("/code")
public class ViewController {
    @RequestMapping("{module}")
    public String web(@PathVariable String module){
        String view = "/view/"+ StringUtils.trim(module);
        return view;
    }
}
