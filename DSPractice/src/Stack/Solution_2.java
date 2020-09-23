/*
*
*
*

You have an empty sequence, and you will be given  queries. Each query is one of these three types:
1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Input Format
The first line of input contains an integer, . The next  lines each contain an above mentioned query. (It is guaranteed that each query is valid.)
*
Output Format
For each type  query, print the maximum element in the stack on a new line.
Sample Input
10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
Sample Output
26
91
* */

package Stack;


import java.util.*;
import java.lang.*;

public class Solution_2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Stack<Integer> Mstac = new Stack<>();

        for(int i = 0; i < n; i++){
            String[] input = sc.nextLine().split(" ");
            switch(Integer.parseInt(input[0])){
                case 1:
                    Mstac.push((Mstac.isEmpty())?(Integer.parseInt(input[1])):(Math.max(Mstac.peek(),Integer.parseInt(input[1]))));
                    break;
                case 2:
                    Mstac.pop();
                    break;
                case 3:
                    System.out.println(Mstac.peek());
                    break;
            }
        }

    }
}

