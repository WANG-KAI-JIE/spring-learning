package top.kjwang.spring.ioc.entity;

/**
 * @author kjwang
 * @Date 2023/3/6 16:38
 */
public class Pen {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
