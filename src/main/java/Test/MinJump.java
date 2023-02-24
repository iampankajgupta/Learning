package Test;

public class MinJump {
    public static void main(String[] args) {
        int[]arr = {2,3,1,1,4};
        int ans = jump(arr);
        System.out.println(ans);

    }

    public static int jump(int[] nums) {

        int ans = helper(nums,0,nums.length);
        return ans;

    }

    public static int helper(int[]nums,int i,int n){
        if(i>=n-1) return 0;
        if(nums[i]==0) return 100000;
        int minJump = 10000;
        for(int k = 1;k<=nums[i];k++){
            minJump = Math.min(minJump,1+helper(nums,k+i,n));
        }
        return minJump;
    }
}
