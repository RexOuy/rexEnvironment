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
    // 借给5-8一个构造函数，与本题无关
    Answer1(Answer8 answer8) {
        System.out.println("get an answer8 value");
    }

    public static void main(String[] args) {
        new Answer1();
    }
}
