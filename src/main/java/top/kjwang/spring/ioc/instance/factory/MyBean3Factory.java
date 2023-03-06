package top.kjwang.spring.ioc.instance.factory;

/**
 * @author kjwang
 * @Date 2023/3/6 21:38
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean() {
        return new Bean3();
    }
}
