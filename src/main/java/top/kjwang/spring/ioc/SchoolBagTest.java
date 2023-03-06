package top.kjwang.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.kjwang.spring.ioc.entity.Pen;
import top.kjwang.spring.ioc.entity.SchoolBag;

/**
 * @author kjwang
 * @Date 2023/3/6 16:45
 */
public class SchoolBagTest {
    public static void main(String[] args) {
        String xmlPath="/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        SchoolBag bag = (SchoolBag) ac.getBean("schoolbag");
        System.out.println(bag.toString());
    }

}
