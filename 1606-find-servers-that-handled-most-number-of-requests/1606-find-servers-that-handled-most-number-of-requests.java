class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> avl = new TreeSet<>();
        PriorityQueue<int[]> busy = new PriorityQueue<>(
                    (a, b) -> Integer.compare(a[0], b[0])
                );

        int[] count = new int[k];

        for(int i  = 0; i < k; i++){
            avl.add(i);
        }

        for(int i  = 0; i < arrival.length; i++){
            while(!busy.isEmpty() && busy.peek()[0] <= arrival[i]){
                avl.add(busy.poll()[1]);
            }
            if(avl.isEmpty()){
                continue;
            }

            int server = i%k;
            Integer assign = avl.ceiling(server);

            if(assign == null){
                assign = avl.first(); 
            }
            avl.remove(assign);
            count[assign]++;
            busy.add(new int[]{arrival[i] + load[i], assign});

           
         
        }
         int max = 0;
            for(int cn : count){
                max = Math.max(max, cn);
            }
           List<Integer> ans = new ArrayList<>();
            for(int j = 0; j < k; j++){
                if(count[j] == max){
                    ans.add(j);
                }
            }
        return ans;
        
    }
}