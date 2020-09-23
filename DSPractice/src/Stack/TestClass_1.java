package Stack;
import java.util.*;

/*
* Problem Description
* You are given a binary string, (string which contains 0's and 1's), You have to perform several operations on this string, in one operation choose a non-empty even length substring containing only 0's or only 1's and remove it from the string.

Your goal is to minimize the final length of the string after performing several operations.It is possible that the final string may become empty, in that case print "KHALI" without quotes.

And it can be proved that there is always an unique string with minimal length after performing the operations.

Input:

First line of input contains an intger T denoting number of testcases.
Next T lines of input contains a binary string S.
Output:

for each testcase print the required minimal string.
Constraints:

1 <= T <= 10
1 <= |S|  <= 105


SAMPLE INPUT
2
101001
1001
SAMPLE OUTPUT
10
KHALI
Explanation
for the first test case, first remove substring "00", now string will become "1011", now remove "11", hence "10" will be the resulting string.


*
* */
class TestClass_1 {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        Integer t = Integer.parseInt(s.nextLine());

        for(int i = 0; i < t; i++){
            String str = s.nextLine();
            Stack<String> stac = new Stack<>();
            for(int j = 0; j < str.length(); j++){
                if(!stac.isEmpty() && stac.peek().equals(Character.toString(str.charAt(j))))
                    stac.pop();
                else
                    stac.push(Character.toString(str.charAt(j)));
            }
            str = stac.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ","");
            if(str.equals(""))
                System.out.println("KHALI");
            else
                System.out.println(str);
        }

    }
}
