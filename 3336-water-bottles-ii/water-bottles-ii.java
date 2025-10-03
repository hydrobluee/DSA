class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty = 0;
        int drunk = 0;
        while(numBottles>0 || empty>=numExchange) {
            if(empty>=numExchange) {
                numBottles++;
                empty -= numExchange;
                numExchange++;
            } else {
                drunk += numBottles;
                empty += numBottles;
                numBottles = 0;
            }
        }
        return drunk;
    }
}