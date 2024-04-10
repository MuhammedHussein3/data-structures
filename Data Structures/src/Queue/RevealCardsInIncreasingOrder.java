package Queue;

import java.util.Arrays;

public class RevealCardsInIncreasingOrder {
    class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {

            Arrays.sort(deck);
            int[]res = new int[deck.length];
            int i = 0, j = deck.length - 1;
            int idx = 0;

            //2 3 5 7 11 13 17
            //1 3 5 7
            //0 = 2
            //1 = 11
            //2 = 3
            //4 = 5
            //6 = 7

            while (i<j){
                res[idx] = deck[i];
                res[idx+1] = deck[j];
                idx+=2;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(res));
            return res;
        }
    }
}
