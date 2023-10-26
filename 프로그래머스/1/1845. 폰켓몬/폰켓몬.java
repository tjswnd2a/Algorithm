class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max_nums = nums.length/2;

        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(temp != -1){
                for(int j = i+1; j < nums.length; j++){
                    if(temp == nums[j]) nums[j] = -1;
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != -1) {
                answer++;
            }
        }
        if (answer > max_nums){
            answer = max_nums;
        }
        return answer;
    }
}