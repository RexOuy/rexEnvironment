package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-22
 * 枚举放进switch里
 * @Author RexOuy
 * @Date 2021/11/17
 */
public class Answer22 {
    Coin c;
    Answer22(Coin c) {
        this.c = c;
    }

    public void describe() {
        switch (c) {
            case one:
                System.out.println("this is a one yuan.");
                break;
            case two:
                System.out.println("this is a two yuan.");
                break;
            case five:
                System.out.println("this is a five yuan.");
                break;
            case ten:
                System.out.println("this is a ten yuan.");
                break;
            case twenty:
                System.out.println("this is a twenty yuan.");
                break;
            case hundred:
                System.out.println("this is a hundred yuan.");
                break;
        }
    }

    public static void main(String[] args) {
        new Answer22(Coin.ten).describe();
    }
}
