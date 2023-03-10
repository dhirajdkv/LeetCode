class Solution {
    public int removeDuplicates(int[] nums) {
        // brute force
        int lastNum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[j] > nums[i])) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    lastNum++;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                lastNum++;
                return lastNum;
            }
        }
        return lastNum + 1;


        //best solution beating 99.99% code
        if(nums.length == 0)
            return 0;
        
        int addIndex = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]){ 
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}
