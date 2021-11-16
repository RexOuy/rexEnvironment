package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-17
 * String数组相关
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer17 {
    Answer17(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Answer17[] ges;
        ges = new Answer17[] {new Answer17("first"),new Answer17("second")}; // question18
    }
    //数组设置的引用类型，并没有创建该类型的对象
}
