package LeetCodePractice;
import java.util.*;

public class RemoveOutermostParantheses {
    public static void main(String arg[]){
        String result = "";
        String str = "(()())(())";
        String[] sArr = str.split("");
        Stack<String> st = new Stack<>();
        for(String element : sArr){
            st.push(element);

        }
    }
}
