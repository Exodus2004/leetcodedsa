class MedianFinder {

    PriorityQueue<Integer> lowerhalf;
    PriorityQueue<Integer> upperhalf;
    public MedianFinder() {
        lowerhalf = new PriorityQueue<>(Collections.reverseOrder());
        upperhalf = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        if(lowerhalf.size()==0 || lowerhalf.peek()>num) lowerhalf.add(num);
        else upperhalf.add(num);
        if(lowerhalf.size()>upperhalf.size()+1){
            upperhalf.add(lowerhalf.poll());
            
        }
        else if(upperhalf.size()>lowerhalf.size()+1){
            lowerhalf.add(upperhalf.poll());
            

        }
        
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