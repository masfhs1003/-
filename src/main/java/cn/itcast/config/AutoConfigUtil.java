package cn.itcast.config;

import cn.itcast.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 方海生
 * @Date 2/1/2018 9:33 PM
 */
@Configuration
public class AutoConfigUtil {

    @Bean
    public User user(){
        User user = new User();
        user.setUid(1);
        user.setUserage(20);
        user.setUsername("小黑");
        return user;
    }


}
