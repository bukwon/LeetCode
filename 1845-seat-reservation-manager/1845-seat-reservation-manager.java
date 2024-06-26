class SeatManager {

    static PriorityQueue<Integer> PQ;
    public SeatManager(int n) {
        PQ = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) PQ.offer(i);
    }

    public int reserve() {
        return PQ.poll();
    }

    public void unreserve(int seatNumber) {
        PQ.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */