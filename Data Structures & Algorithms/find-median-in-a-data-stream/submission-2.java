class MedianFinder {
       private Queue<Integer> smallQueu;
       private Queue<Integer> maxQueu;
    public MedianFinder() {
        smallQueu = new PriorityQueue<>((a,b) -> b-a);
        maxQueu = new PriorityQueue<>((a, b) -> a-b);
        
    }
    
    public void addNum(int num) {
        smallQueu.add(num);
        if(smallQueu.size() - maxQueu.size() > 1 || 
        (!maxQueu.isEmpty() && smallQueu.peek() > maxQueu.peek())
        ){
            maxQueu.add(smallQueu.poll());
        }
        if (maxQueu.size() - smallQueu.size() > 1){
            smallQueu.add(maxQueu.poll());
        }
    
    }
    
    public double findMedian() {
        if(smallQueu.size() == maxQueu.size()){
            return (double) (maxQueu.peek() + smallQueu.peek()) / 2.0;
        }
        else if(smallQueu.size() > maxQueu.size()){
            return (double) (smallQueu.peek());
        }
        else {
            return (double) maxQueu.peek();
        }
    }
}
