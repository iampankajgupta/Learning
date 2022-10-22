import java.util.*;

public class Test {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine().trim());
    List<Integer> A = new ArrayList<>(N);
    for(int j=0;j<N;j++){
      A.add(Integer.parseInt(scan.nextLine().trim()));
    }
    long result = maxSum(N,A);
    System.out.println(result);
  }

  private static long maxSum(int N, List<Integer> A) {
    PriorityQueue<Integer>minHeap = new PriorityQueue<>();
    PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    int maxRemove = N/3;
    int firstHalf = N/2;
    int i = 0;
    // store the first half element
    for(i = 0;i<firstHalf;i++){
      minHeap.add(A.get(i));
    }
    // store the second Half element
    for(i = firstHalf;i<N;i++){
      maxHeap.add(A.get(i));
    }

    while(maxRemove>=0){
      maxHeap.poll();
      maxRemove--;
      if(maxRemove>=0){
        minHeap.poll();
        maxRemove--;
      }
    }
    int minHeapSum = 0;
    while(minHeap.size()>0){
      minHeapSum+=minHeap.poll();
    }
    int maxHeapSum = 0;
    while(maxHeap.size()>0){
      maxHeapSum+=maxHeap.poll();
    }
    return minHeapSum-maxHeapSum;
  }
}
