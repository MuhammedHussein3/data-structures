package Queue;

public class TimeNeededToBuyTickets {
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int res = 0;
            int p = tickets[k];
            for(int i = 0;i<tickets.length;i++)
            {
                int buy = (i>k)?p-1:p;
                res+=Math.min(buy,tickets[i]);

            }
            return res ;
        }
    }
}
