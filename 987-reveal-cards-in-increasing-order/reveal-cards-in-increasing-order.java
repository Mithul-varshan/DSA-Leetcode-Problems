class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[deck.length];
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        for(int i=0;i<deck.length;i++){
            int idx = q.poll();
            res[idx] = deck[i];
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return res;
    }
}