class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(hashMap.keySet());

        list.sort((o1, o2) ->
                hashMap.get(o2).compareTo(hashMap.get(o1)));

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}