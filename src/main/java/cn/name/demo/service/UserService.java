package cn.name.demo.service;

import cn.name.demo.domain.User;
import cn.name.demo.domain.UserExample;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */
public interface UserService {
    /**
     * 查询User中所有信息且分页
     * @return
     */
    PageInfo<User> findAll(Integer pageNum);

    /**
     * 根据UserId查询用户信息
     * @param user
     * @return
     */
    User findById(User user);

    /**
     * 根据UserName查询用户信息
     * @param user
     * @return
     */
    User findByName(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer save(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    Integer romove(User user);

    /**
     * 根据UserId更新用户信息
     * @param user
     * @return
     */
    Integer edit(User user);
}
