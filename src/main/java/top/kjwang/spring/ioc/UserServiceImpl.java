package top.kjwang.spring.ioc;

/**
 * @author kjwang
 * @Date 2023/3/6 15:13
 * @Description UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao, String str) {
        this.userDao = userDao;
        this.str = str;
    }


    String str;

    public UserServiceImpl(String str) {
        this.str = str;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void say(){
        this.userDao.say();
        System.out.println("userService say hello world!");
    }

    @Override
    public void str(){
        System.out.println(str);
    }
}
