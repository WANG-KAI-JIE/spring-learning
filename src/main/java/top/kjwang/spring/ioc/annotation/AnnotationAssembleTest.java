package top.kjwang.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 22:32
 */
public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans6.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
