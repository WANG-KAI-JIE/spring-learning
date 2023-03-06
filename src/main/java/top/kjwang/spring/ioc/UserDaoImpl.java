package top.kjwang.spring.ioc;

/**
 * @author kjwang
 * @Date 2023/3/6 14:49
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void say(){
        System.out.println("userDao say hello world!");
    }
}
