package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-21
 * 枚举
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer21 {
    public static void main(String[] args) {
        for (Coin c:Coin.values()) {
            System.out.println(c);
            System.out.println(c.ordinal());
        }
    }
}
