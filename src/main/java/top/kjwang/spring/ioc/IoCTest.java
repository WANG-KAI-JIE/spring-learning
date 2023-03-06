package top.kjwang.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 14:53
 * @Description 测试IoC
 */
public class IoCTest {
    public static void main(String[] args) {
//        1.配置文件路径
        String xmlPath = "/applicationContext.xml";
//        2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
//        3.从配置文件中读取配置好的bean
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.say();
    }
}
