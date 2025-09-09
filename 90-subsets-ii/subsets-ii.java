class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res=new ArrayList<>();
        rec(nums,0,new ArrayList<>());
        return res;
    }
    public void rec(int[] nums,int idx,List<Integer> ans)
    {
        res.add(new ArrayList<>(ans));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            rec(nums,i+1,ans);
            ans.remove(ans.size()-1);
        }
    }
}