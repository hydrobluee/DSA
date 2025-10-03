class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int drunk = 0;
        while(full>0 || empty>=numExchange) {
            if(empty>=numExchange) {
                full++;
                empty -= numExchange;
                numExchange++;
            } else {
                drunk += full;
                empty += full;
                full = 0;
            }
        }
        return drunk;
    }
}