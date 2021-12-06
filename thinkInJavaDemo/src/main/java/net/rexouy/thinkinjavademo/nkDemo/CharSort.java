package net.rexouy.thinkinjavademo.nkDemo;

import java.util.ArrayList;
import java.util.List;

public class CharSort {

    public char[] stringToC(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length];
        for (int i =0;i<chars.length;i++) {
            ints[i] = chars[i]-0;
        }
        quickSort(ints, 0,chars.length-1);
        for (int i =0;i<chars.length;i++) {
            chars[i] = (char)ints[i];
        }
        for (char c : chars) {
            System.out.println(c);
        }
        return chars;
    }

    //快速排序
    public void quickSort(int[] arr,int begin,int end) {
        if (begin<end) {
            int base = arr[begin];
            int tmp;
            int i = begin;
            int j = end;
            do {
                while (arr[i]<base && i<end)
                    i++;
                while (arr[j]>base && j>begin)
                    j--;
                if (i<=j) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            } while (i<=j);
            quickSort(arr,begin,j);
            quickSort(arr,i,end);
        }
    }

    public static void main(String[] args) {
        CharSort charSort = new CharSort();
        charSort.stringToC("whatafegdjhfyjjlhlnjn.mnm.gyedtfsedtwetw6hsfabcduckman.");
    }
}
