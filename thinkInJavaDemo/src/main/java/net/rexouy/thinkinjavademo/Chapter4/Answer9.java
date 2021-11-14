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
        int c = 0;
        // 层数
        int num = 1;
        switch (num) {
            case 1:
                System.out.print(a+" ");
            case 2:
                System.out.print(b+" ");
            case 3:
                c=a+b;
                a=c;
                System.out.print(c+" ");
            case 4:
                c=a+b;
                a=c;
                System.out.print(c+" ");
            case 5:
                c=a+b;
                a=c;
                System.out.print(c+" ");
            case 6:
                c=a+b;
                a=c;
                System.out.print(c+" ");
            case 7:
                c=a+b;
                a=c;
                System.out.print(c+" ");
        }
    }
}
