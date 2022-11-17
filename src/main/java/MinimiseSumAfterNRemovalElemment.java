import java.util.Collections;
import java.util.PriorityQueue;

public class MinimiseSumAfterNRemovalElemment {
    public static void main(String[] args) {
        PriorityQueue<Integer>minHeap = new PriorityQueue<>();
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[]arr = {3,1,4,1,5,9};
        int n = arr.length;
        long[]suffix = new long[n];

        int finalN = n/3;
        long sum = 0;

        for(int i = n-1;i>=finalN;i--){
            sum+=arr[i];
            minHeap.add(arr[i]);
            if(minHeap.size()>finalN){
                sum-= minHeap.poll();
            }
            if(minHeap.size()==finalN)
                suffix[i] = sum;
        }

        sum = 0;
        long finalMax = Long.MAX_VALUE;
        for(int i = 0;i<n-finalN;i++){
            sum+=arr[i];
            maxHeap.add(arr[i]);
            if(maxHeap.size()>finalN){
                sum-= maxHeap.poll();
            }
            if(maxHeap.size()==finalN)
                finalMax = Math.min(finalMax,sum-suffix[i+1]);
        }
        System.out.println(finalMax);
    }
}
