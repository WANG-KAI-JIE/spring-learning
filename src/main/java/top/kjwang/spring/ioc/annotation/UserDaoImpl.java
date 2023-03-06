package top.kjwang.spring.ioc.annotation;

import org.springframework.stereotype.Repository;
/**
 * @author kjwang
 * @Date 2023/3/6 22:11
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void save(){
        System.out.println("userDao……save……");
    }
}
