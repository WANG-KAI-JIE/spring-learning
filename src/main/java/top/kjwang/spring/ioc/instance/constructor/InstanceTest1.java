package top.kjwang.spring.ioc.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 21:29
 */
public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans1.xml");
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println(bean1);
    }
}
