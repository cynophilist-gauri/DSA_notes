import java.util.*;
class move_zeroes{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int nums[] = new int[5];
        System.out.println("Enter the numbers");
        for(int i=0; i<5; i++){
            nums[i] = obj.nextInt();
        }
        int j = 0;
        for(int i=0; i<5; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(int i=j; i<nums.length; i++){
            nums[j] = 0;
        }
        for(int i=0; i<5; i++){
System.out.println(nums[i]);
}
    }
    
}
