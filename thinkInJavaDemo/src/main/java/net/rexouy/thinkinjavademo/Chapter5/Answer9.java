package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-9
 * 构造器里调用构造器
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer9 {
    String str;
    int i = 0;
    Answer9(String str) {
        this.str = str;
    }
    Answer9(String str,int i) {
        this(str);
        this.i = i;
    }

    @Override
    public String toString() {
        return "Answer9{" +
                "str='" + str + '\'' +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(
                new Answer9("new str",1000)
        );
    }
}
