class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long opt1  = (long) need1 * cost1 + (long) need2 * cost2;

        int both = Math.min(need1, need2);
        long opt2 = (long) both * costBoth 
                    + (long) (need1 - both) * cost1 
                    + (long) (need2 - both) * cost2;

        long opt3 = (long) Math.max(need1, need2) * costBoth;

        return Math.min(opt1, Math.min(opt2, opt3));            


    }
}