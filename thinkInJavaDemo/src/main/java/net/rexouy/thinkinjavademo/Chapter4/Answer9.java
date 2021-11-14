package net.rexouy.thinkinjavademo.Chapter4;


/**
 *  4-9
 *
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        // 自定义的层数
        int num = 11;

        for(int i = 1;i<= num;i++) {
            if (i<=2) {
                System.out.print(1+" ");
            } else {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
    }
}
