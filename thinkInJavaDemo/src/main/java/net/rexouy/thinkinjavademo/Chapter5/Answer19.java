package net.rexouy.thinkinjavademo.Chapter5;


/**
 * 5-19
 * 可变参数
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer19 {
    Answer19(String...value) {
        for (String str : value) {
            System.out.print(str);
        }
    }

    public static void main(String...args) {
        new Answer19("a","b","c");
        new Answer19(new String[]{"d","e","f"});
    }
}
