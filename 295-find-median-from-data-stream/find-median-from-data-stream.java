class MedianFinder {

    PriorityQueue<Integer> lowerhalf;
    PriorityQueue<Integer> upperhalf;
    public MedianFinder() {
        lowerhalf = new PriorityQueue<>(Collections.reverseOrder());
        upperhalf = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        lowerhalf.add(num);
        upperhalf.add(lowerhalf.poll());
        if(lowerhalf.size()<upperhalf.size()) lowerhalf.add(upperhalf.poll());
        
    }
    
    public double findMedian() {
        double val = 0;
        if(lowerhalf.size()==upperhalf.size()) val = (double)(upperhalf.peek()+lowerhalf.peek())/2;
        else if(lowerhalf.size()>upperhalf.size()) val = lowerhalf.peek();
        else val = upperhalf.peek();

        return val;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */