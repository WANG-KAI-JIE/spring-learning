package top.kjwang.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kjwang
 * @Date 2023/3/6 22:22
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(){
        //调用userDao中的save方法
        this.userDao.save();
        System.out.println("userService……save……");
    }
}
