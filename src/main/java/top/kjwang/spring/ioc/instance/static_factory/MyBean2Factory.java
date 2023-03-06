package top.kjwang.spring.ioc.instance.static_factory;

/**
 * @author kjwang
 * @Date 2023/3/6 21:34
 */
public class MyBean2Factory {
    public static Bean2 createBean(){
        return new Bean2();
    }
}
