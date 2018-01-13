package cn.name.demo.service.impl;

import cn.name.demo.domain.User;
import cn.name.demo.domain.UserExample;
import cn.name.demo.mapper.UserMapper;
import cn.name.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserExample userExample;

    /**
     * 查询User中所有信息且分页
     *
     * @return
     */
    @Override
    public PageInfo<User> findAll(Integer pageNum) {
        //分页、pageNum是当前页数，pageSize是当前页面数据条数
        PageHelper.startPage(pageNum,5);
        //查询user所有
        List<User> user=userMapper.selectByExample(userExample);
        //PageInfo获取分页信息
        PageInfo<User> pageInfo=new PageInfo<>(user);
        return pageInfo;
    }

    /**
     * 根据UserId查询用户信息
     *
     * @param user
     * @return
     */
    @Override
    public User findById(User user) {
        return userMapper.selectByPrimaryKey(user.getUserId());

    }

    /**
     * 根据UserName查询用户信息
     *
     * @param user
     * @return
     */
    @Override
    public User findByName(User user) {
        userExample.createCriteria().andUserNameEqualTo(user.getUserName());

        return (User)userMapper.selectByExample(userExample);
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Override
    public Integer save(User user) {

        return userMapper.insert(user);
    }

    /**
     * 删除用户
     *根据userid删除
     * @param user
     * @return
     */
    @Override
    public Integer romove(User user) {

        return userMapper.deleteByPrimaryKey(user.getUserId());
    }

    /**
     * 根据UserId更新用户信息
     *
     * @param user
     * @return
     */
    @Override
    public Integer edit(User user) {

        return userMapper.updateByPrimaryKeySelective(user);
    }
}
