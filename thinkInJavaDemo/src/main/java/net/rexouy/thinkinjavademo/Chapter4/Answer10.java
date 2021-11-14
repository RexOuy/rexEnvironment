package net.rexouy.thinkinjavademo.Chapter4;

import java.util.Arrays;

/**
 * 4-10
 * 4位吸血鬼数
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer10 {
    public static void main(String[] args) {
        for (int i =10;i<100;i++) {
            for (int j =i+1;j<100;j++) {
                // 乘积
                int ij = i*j;
                if (ij>1000&&ij<10000) {
                    String[] ij_str = String.valueOf(ij).split("");
                    String[] i_j_link_str = (i +String.valueOf(j)).split("");
                    Arrays.sort(ij_str);
                    Arrays.sort(i_j_link_str);
                    if (Arrays.equals(ij_str,i_j_link_str)) {
                        System.out.println(i+" * "+j+" = "+ij);
                    }
                }
            }
        }
    }
}
