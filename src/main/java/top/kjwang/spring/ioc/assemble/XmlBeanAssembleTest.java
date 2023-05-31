package top.kjwang.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/7 08:59
 */
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        String xmlPath = "/beans5.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
