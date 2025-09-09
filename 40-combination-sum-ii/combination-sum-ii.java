class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        res=new ArrayList<>();
        rec(candidates,target,0,0,new ArrayList<>());
        return res;
    }
    public void rec(int[] nums,int target,int idx,int sum,List<Integer> ans)
    {
        if(sum==target){
            res.add(new ArrayList<>(ans));
        }
        if(sum>target || idx==nums.length) return;
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            sum+=nums[i];
            rec(nums,target,i+1,sum,ans);
            sum-=nums[i];
            ans.remove(ans.size()-1);
        }
    }
}