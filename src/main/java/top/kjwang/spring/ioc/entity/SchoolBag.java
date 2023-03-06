package top.kjwang.spring.ioc.entity;

import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/6 16:38
 */
public class SchoolBag {
    private String color;
    private List<Pen> pencilCase;

    @Override
    public String toString() {
        return "SchoolBag{" +
                "color='" + color + '\'' +
                ", pencilCase=" + pencilCase +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPencilCase() {
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }
}
