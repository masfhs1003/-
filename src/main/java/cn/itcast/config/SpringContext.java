package cn.itcast.config;

import cn.itcast.model.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 方海生
 * @Date 2/1/2018 9:36 PM
 */
@Configuration//包扫描,交给Spring容器管理
public class SpringContext implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {

            System.out.println("name:" +name);
        }
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.getUsername()+user.getUserage());
    }
}
