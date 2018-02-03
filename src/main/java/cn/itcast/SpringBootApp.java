package cn.itcast;

import cn.itcast.usercontroller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author 方海生
 * @Date 2/1/2018 8:48 PM
 */
/*@EnableAutoConfiguration
@ComponentScan(basePackages = {"cn.itcast"})*/
@SpringBootApplication//自动
public class SpringBootApp {
    public static void main(String[] args) {
        //告诉Spring把UserController托管进容器
        SpringApplication.run(SpringBootApp.class);
    }
}
