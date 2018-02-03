package cn.itcast.usercontroller;

import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 方海生
 * @Date 2/1/2018 6:28 PM
 */

/**
 * 诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。由于 spring-boot-starter-web 添加了Tomcat和Spring MVC，
 * 所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
 */
/*@EnableAutoConfiguration*/

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @return
     */
    @RequestMapping(value = "/list",produces = "application/json")
    public Map<String,Object> user(){
        System.out.println("my name is xiaohong");
        userService.addUser("方帅");
        HashMap<String, Object> datamap = new HashMap<>();
        datamap.put("name","小红");
        return datamap;
    }



}
