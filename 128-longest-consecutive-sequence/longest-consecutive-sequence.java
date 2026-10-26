class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer>hs=new HashSet<>();
    for(int num:nums){
        hs.add(num);
    }    
    int longest=0;
    for(int n:hs){
        if(!hs.contains(n-1)){
            int currnum=n;
            int c=1;
            while(hs.contains(currnum+1)){
                currnum++;
                c++;
            }
        longest=Math.max(longest,c);
        }
    }
    return longest;
    }
}