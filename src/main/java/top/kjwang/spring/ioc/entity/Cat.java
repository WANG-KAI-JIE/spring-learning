package top.kjwang.spring.ioc.entity;

/**
 * @author kjwang
 * @Date 2023/3/6 15:44
 */
public class Cat {
    String name;
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }
}
