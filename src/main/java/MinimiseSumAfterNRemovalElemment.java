import java.util.Collections;
import java.util.PriorityQueue;

public class MinimiseSumAfterNRemovalElemment {
    public static void main(String[] args) {
        int[]arr = {7,9,5,8,1,3};
        PriorityQueue<Integer>minHeap = new PriorityQueue<>();
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = arr.length;
        int[]prefix = new int[n];
        int[]suffix = new int[n];


        int finalN = n/3;
        int sum = 0;

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
        int finalMax = 0;
        for(int i = 0;i<prefix.length-finalN;i++){
            sum+=arr[i];
            maxHeap.add(arr[i]);
            if(maxHeap.size()>finalN){
                sum-= maxHeap.poll();
            }
            if(maxHeap.size()==finalN){
                prefix[i] = sum;
                finalMax = Math.min(finalMax,sum-suffix[i+1]);
            }

        }
        System.out.println(finalMax);
    }
}
