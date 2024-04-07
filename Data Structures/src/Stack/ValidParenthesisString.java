package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParenthesisString {

    class Edge{
        char ch;
        int pos;
        public Edge(char ch,int pos){
            this.ch = ch;
            this.pos = pos;
        }
    }
    class Solution {
        public boolean checkValidString(String s) {

            List<Integer> strs = new ArrayList<>();
            Stack<Edge> stack = new Stack<>();
            for (int i = 0;i<s.length();i++) {
                char c = s.charAt(i);
                if (c=='('){
                    stack.push(new Edge('(',i));
                }else if (c==')'){
                    if (!stack.isEmpty()&&stack.peek().ch=='('){
                        stack.pop();
                    }else
                        stack.push(new Edge(')',i));

                }else if (c=='*'){
                    strs.add(i);

                }
            }
            if (stack.isEmpty())
                return true;
            while (!stack.isEmpty()){
                Edge edge = stack.pop();
                int pos = edge.pos;
                char ch = edge.ch;
                boolean find = false;
                if (ch=='(') {
                    for (int i = 0; i < strs.size(); i++) {
                        if (strs.get(i) > pos)
                        {
                            find = true;
                            strs.remove(strs.get(i));
                            break;
                        }
                    }
                }else {

                    for (int i =  strs.size()-1;i>=0; i--) {
                        if (strs.get(i) < pos)
                        {
                            find = true;
                            strs.remove(strs.get(i));
                            break;
                        }
                    }
                }
                if (!find){
                    return false;
                }

            }

            return stack.isEmpty();
        }
    }
}
