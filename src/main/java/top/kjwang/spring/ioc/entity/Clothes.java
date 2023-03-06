package top.kjwang.spring.ioc.entity;

/**
 * @author kjwang
 * @Date 2023/3/6 16:10
 */
public class Clothes {
    String style;
    String color;

    @Override
    public String toString() {
        return "Clothes{" +
                "style='" + style + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Clothes(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothes() {
    }
}
