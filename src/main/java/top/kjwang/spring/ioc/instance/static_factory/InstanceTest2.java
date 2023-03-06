package top.kjwang.spring.ioc.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kjwang
 * @Date 2023/3/6 21:36
 */
public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans2.xml");
        Bean2 bean2 = context.getBean("bean2",Bean2.class);
        System.out.println(bean2);
    }
}
