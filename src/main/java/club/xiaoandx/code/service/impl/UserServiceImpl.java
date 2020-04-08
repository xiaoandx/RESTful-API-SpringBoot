package club.xiaoandx.code.service.impl;

import club.xiaoandx.code.dao.UserMapper;
import club.xiaoandx.code.model.User;
import club.xiaoandx.code.service.UserService;
import club.xiaoandx.code.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhouwei on 2020/04/08.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
