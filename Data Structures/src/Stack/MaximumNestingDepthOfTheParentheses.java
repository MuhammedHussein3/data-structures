package Stack;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    class Solution {
        public int maxDepth(String s) {

            Stack<Character> stk = new Stack<>();

            int depth = 0;
            for(int i = 0;i < s.length();i++)
            {
                if(s.charAt(i)=='(')
                    stk.push('(');
                else if(s.charAt(i)==')'&&!stk.isEmpty()){
                    depth = Math.max(depth,stk.size());
                    stk.remove(stk.size()-1);
                }
            }
            return depth;
        }
    }
}
