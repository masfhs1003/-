package cn.itcast.service.impl;

import cn.itcast.service.UserService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @Author 方海生
 * @Date 2/1/2018 9:48 PM
 */
@Service
//@ConfigurationProperties(prefix = "user")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String s) {
//        System.out.println(username);
//        System.out.println(address);
        System.out.println(s);
    }

}
