package LeetCodePractice;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class CandyCrush {
    public static void main(String arg[]){
        String s = "aavvvaccd";
        int k = 3;
        String[] strArr = s.split("");

        Stack<String> st = new Stack<>();

        for(String element : strArr){
            st.push(element);
            if(st.size() >= k){
                // need to generalize push and pop for k by using Set
                String first = st.pop();
                String second = st.pop();
                String third = st.pop();
                if(!(first.equals(second) && second.equals(third))){
                    st.push(third);
                    st.push(second);
                    st.push(first);
                }
            }
        }
        System.out.println(st);
    }
}
