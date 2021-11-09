package net.rexouy.thinkinjavademo.Chapter2;

/**
 * 2.11 练习1
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer1 {
    private int intValue;
    private double doubleValue;

    public int getIntValue() {
        return intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    /**
     * 答案外,看看局部变量有啥反应
     * @return int
     */
    public int isInit() {
        int innerValue;
        Integer innerValue2;
//        return innerValue;   局部变量不会给定默认值
//        return innerValue2;  null都不给= =
        return 0;
    }


    public static void main(String[] args) {
        Answer1 answer1 = new Answer1();
        System.out.println("int: "+ answer1.getIntValue());
        System.out.println("double: " + answer1.getDoubleValue());
    }

}
