package Stack;

import java.util.Stack;

public class RemoveKDigits {
    class Solution {
        public String removeKdigits(String num, int k) {

            Stack<Integer> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < num.length(); i++) {
                if (stack.isEmpty())
                    stack.push(num.charAt(i)-'0');
                else
                {
                    while (!stack.isEmpty()&&stack.get(stack.size()-1)> num.charAt(i)-'0' && k-->0)
                    {
                        stack.pop();
                    }

                    stack.push(num.charAt(i)-'0');
                }
            }
            while(k-->0)
                stack.pop();

            while(!stack.isEmpty())
            {
                sb.append(stack.pop());
            }

            String res = new String(sb.reverse());

            for(int i = 0;i<res.length();i++)
            {
                if(res.charAt(i)!='0')
                    return res.substring(i);

            }
            return "0";

        }
    }

}
