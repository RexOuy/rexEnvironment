package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-1
 * 验证String不创建初始值则为null
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer1 {
    String value;
    Answer1() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        new Answer1();
    }
}
