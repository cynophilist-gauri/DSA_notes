class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pointer = 0;

        while(pointer <= end){
            if(nums[pointer] == 0){
                swap(nums, pointer, start);
                start++;
                pointer++;
            }
            else if(nums[pointer] == 1){
                pointer++;
            }
            else{
                swap(nums, pointer, end);
                end--;
            }
        }
    }
        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
