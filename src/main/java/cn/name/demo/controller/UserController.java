package cn.name.demo.controller;

import cn.name.demo.domain.User;
import cn.name.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */

//controller层并且返回json
@RestController
@RequestMapping("/user")
public class UserController {
    //注入service
    @Autowired
    UserService userService;

    /**
     * 查询所有用户，且分页
     * @return
     */
    @PostMapping("findAll")
    public PageInfo<User> findAll(@RequestParam(defaultValue = "1") Integer pageNum) {
        PageInfo<User> user = userService.findAll(pageNum);
        return user;
    }

    /**
     * 用户信息
     * @return
     */
    @PostMapping("info")
    public User info(User user){

        return userService.findById(user);
    }

    /**
     * 添加用户信息
     * @return
     */
    @PostMapping("save")
    public String save(User user){
        int row=userService.save(user);
        if (row>0){
            return "成功";
        }else {
            return "失败";
        }

    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PostMapping("edit")
    public String edit(User user){
        int row=userService.edit(user);
        if (row>0){
            return "成功";
        }else {
            return "失败";
        }
    }

    /**
     * 删除用户信息
     * @param user
     * @return
     */
    @GetMapping("delete")
    public String delete(User user){
        int row=userService.romove(user);
        if (row>0){
            return "成功";
        }else {
            return "失败";
        }
    }
}
