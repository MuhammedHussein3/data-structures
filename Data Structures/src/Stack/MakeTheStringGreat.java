package Stack;

import java.util.Stack;

public class MakeTheStringGreat {
    class Solution {
        public String makeGood(String s) {
            Stack<Character> stack=new Stack<>();
            int k=0;
            while (k<s.length())
            {
                if (!stack.isEmpty()&&Math.abs(stack.get(stack.size()-1)-s.charAt(k))==32)
                {
                    stack.remove(stack.size()-1);
                }
                else
                    stack.add(s.charAt(k));

                k++;
            }
            String ss="";
            while (!stack.isEmpty())
            {
                ss+=stack.remove(0);
            }
            if(ss.isEmpty())
                return "";

            return ss;
        }
    }
}
