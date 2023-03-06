package top.kjwang.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 15:19
 */
public class SetterDITest {
    public static void main(String[] args) {
        //        1.配置文件路径
        String xmlPath = "/applicationContext.xml";
        //        2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //        3.从配置文件中读取配置好的bean
        UserService userService = (UserService) ac.getBean("userService");
        userService.say();
        userService.str();
    }
}
