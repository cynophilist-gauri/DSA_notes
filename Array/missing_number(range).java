class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       int left = 0; int right = nums.length; int mid = (left + right) / 2;
           while(left < right){
            mid = (left + right) / 2;
            if(nums[mid] > mid) right = mid;
            else left = mid + 1;
           }
       return left;
    }
}

/* 
Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i != nums[i]) 
              return i;
        }
        return nums.length;
*/

/*
int sum = (nums.length * (nums.length + 1)) / 2;
       for(int i=0; i<nums.length; i++){
           sum -= nums[i];
       }
       return sum;
*/
