import java.util.*;
class maximum_subarray{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int[] nums=new int[5];
        System.out.println("Enter the elements");
        for(int i=0; i<nums.length; i++){
            nums[i] = read.nextInt();
        }
        System.out.println("Maximun Subarray Sum = " + max_subarray(nums));
    }
    static int max_subarray(int nums[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        return max;
    }
}
