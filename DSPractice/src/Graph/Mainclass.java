package Graph;

import java.util.*;

public class Mainclass {
    public static void main(String[] arg){

        int n = 10;
        Queue<List<Integer>> qu = new PriorityQueue<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);
        qu.add(l1);

        int[][] graph = {{1,2,3,4},{1,0},{0}};

        System.out.println("length = "+graph[2].length);




        while(!qu.isEmpty()){
            List<Integer> temp = qu.remove();
            if(temp.get(temp.size()-1) == n-1){
                //add it to result
            } else {
                //got to that index and add all the possible
            }

        }

    }
}
