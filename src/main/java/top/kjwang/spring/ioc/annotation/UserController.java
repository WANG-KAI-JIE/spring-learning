package top.kjwang.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author kjwang
 * @Date 2023/3/6 22:24
 */

@Controller("userController")
public class UserController {

    @Autowired
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("userController……save……");
    }
}
