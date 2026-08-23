class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        //store all numbers in hashset
        for (int num:nums){
            set.add(num);
        }
        int longest =0;

        //check every number
        for (int num : set){

            //check if it is start of sequence

            if(!set.contains(num-1)){

                int currentNum = num;
                int count=1;

                //find consecutive numbers
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }
        return longest;
        
    }
}