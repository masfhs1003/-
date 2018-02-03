package cn.itcast.usercontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 方海生
 * @Date 2/1/2018 8:56 PM
 */
@RestController
public class BookController {

    @RequestMapping(value = "test")
    public String test(){
        System.out.println("小红你好!");
        return "小红果";
    }
}
