package net.rexouy.thinkinjavademo.nkDemo;

import java.util.*;

public class MemoOutDemo {
    public int[] LRU (int[][] operators, int k) {
        //最后返回
        List<Integer> finalList = new ArrayList<>();
        int topActive = 1;
//         int[] finalS = new int[operators.length];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        //活跃
        Map<Integer,Integer> active = new HashMap<Integer,Integer>();
        // write code here
        for(int[]per : operators) {
            if(per[0]==1) {
                if(map.size()>=k) {
                    List<Map.Entry<Integer,Integer>> maplist = new ArrayList<>(active.entrySet());
                    Collections.sort(maplist,(o1, o2)->o1.getValue()-o2.getValue());
                    active.remove(maplist.get(0).getKey());
                    map.put(maplist.get(0).getKey(),-1);
                }
                map.put(per[1],per[2]);
                active.put(per[1],topActive++);
                //set
            }
            if(per[0]==2) {
                if (map.get(per[1])==null) {
                    finalList.add(-1);
                }
                else {
                    finalList.add(map.get(per[1]));
                    active.put(per[1],topActive++);
                }
                //get
            }
        }


        return finalList.stream().mapToInt(Integer::valueOf).toArray();

//        int[] finalInt = new int[finalList.size()];
//        for(int i =0;i<finalInt.length;i++) {
//            finalInt[i] = (int)finalList.get(i);
//        }

//        return finalInt;
    }

    public static void main(String[] args) {
        MemoOutDemo demo = new MemoOutDemo();
        for (int x : demo.LRU(new int[][]{{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}},3)) {
            System.out.println(x);
        }

    }
}
