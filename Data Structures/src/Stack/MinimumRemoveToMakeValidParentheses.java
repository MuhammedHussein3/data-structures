package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    class P {
        private char ch;
        private int pos;

        public P(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }
        class Solution {
            public String minRemoveToMakeValid(String s) {

                Stack<P> stack = new Stack<>();
                List<Integer> pos = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c=='('){
                        stack.push(new P(c,i));
                    }else if (c==')'){
                        if (!stack.isEmpty() && stack.peek().ch=='('){
                            stack.pop();
                        }else
                            stack.push(new P(c,i));
                    }

                }
                while (!stack.isEmpty()){
                    P p = stack.pop();
                    pos.add(p.pos);

                }
                StringBuilder res = new StringBuilder();
                for (int i = 0 ;i<s.length();i++){
                    char c = s.charAt(i);
                    if (!pos.contains(i))
                    {
                        res.append(c);
                }
                }
                return new String(res);
            }
        }

}
