class Solution {
    public int minSetSize(int[] arr) {
        final int[] counts = new int[100001];

        for(final int v : arr)
            counts[v]++;

        final Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i < 100001; ++i)
            if(counts[i] != 0)
                queue.offer(counts[i]);

        int size = (arr.length + 1) / 2, res = 0;

        while(size > 0) {
            size -= queue.poll();
            res++;
        }

        return res;   
    }
}