package top.kjwang.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.kjwang.spring.ioc.entity.Book;

/**
 * @author kjwang
 * @Date 2023/3/6 16:01
 */
public class BookTest {
    public static void main(String[] args) {
        String xmlPath = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        Book book1 = (Book)ac.getBean("book1");
        System.out.println("book对象通过带参构造方法创建："+book1.toString());
        Book book2 = (Book)ac.getBean("book2");;
        book2.setId("876554321");
        book2.setName("加油啊肥猫猫");
        book2.setPrice(88.88);
        System.out.println("book对象通过默认构造方法创建："+book2.toString());
    }
}
