package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {

            int count = 0;
            boolean flag = false;
            Queue<Integer> studentsQ = new LinkedList<Integer>();
            int j = 0;
            for (int i : students){
                studentsQ.add(i);
            }
            while(!flag) {

                if (studentsQ.isEmpty()||count>=studentsQ.size())
                    return count;
                if (studentsQ.peek()==sandwiches[j]) {
                    j++;
                    studentsQ.remove();
                    count=0;
                }else
                {
                    int temp = studentsQ.peek();
                    studentsQ.remove();
                    studentsQ.add(temp);
                    count++;
                }

            }
            return count;
        }
    }
}
