package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-8
 * 调用外部方法两次，一次无参，一次this参数
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer8 {
    public void getAnswer1Value() {
        new Answer1();
        new Answer1(this);
    }
    public static void main(String[] args) {
        new Answer8().getAnswer1Value();
    }
}
