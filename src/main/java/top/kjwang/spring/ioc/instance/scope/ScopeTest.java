package top.kjwang.spring.ioc.instance.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 21:45
 */
public class ScopeTest {
    public static void main(String[] args) {
        String xmlPath = "/beans4.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));
    }
}
