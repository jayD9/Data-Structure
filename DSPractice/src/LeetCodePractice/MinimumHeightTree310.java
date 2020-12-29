package LeetCodePractice;


import java.util.*;


public class MinimumHeightTree310 {
    public static void main(String arg[]){

        int[][] temp = {{1,0},{1,2},{1,3}};
        int n = 4;

        Map<Integer, Integer> hmp = new HashMap<>();

        for(int i = 0; i < temp.length; i++){
            int count0 = 1;
            int count1 = 1;
            if(hmp.containsKey(new Integer(temp[i][0])))
                count0 += hmp.get(temp[i][0]);
            if(hmp.containsKey(new Integer(temp[i][1])))
                count1 += hmp.get(temp[i][1]);
            hmp.put(temp[i][0],count0);
            hmp.put(temp[i][1],count1);
        }

        System.out.println(hmp);

        List<Map.Entry<Integer,Integer>> list = new ArrayList(hmp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(n-list.get(0).getValue()-1);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= n-list.get(0).getValue()-1; i++){
            result.add(list.get(i).getKey());
        }
        System.out.println(result);


    }
}
