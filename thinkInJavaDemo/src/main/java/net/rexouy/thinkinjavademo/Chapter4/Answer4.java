package net.rexouy.thinkinjavademo.Chapter4;

/**
 * 4-4
 * 找100内素数
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer4 {
    public static void main(String[] args) {
        System.out.print(1+" "+2+" ");
        // i是正在检测的数
        for (int i = 2;i<=100;i++) {
            // 被2整除跳过
            if (i%2==0) {
                continue;
            }
            // j从2开始加到i-1，如果都没有匹配上，那说明是素数
            for (int j=2;j<i;j++) {
                if (i%j==0) {
                    break;
                }
                if (j==(i-1)) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
