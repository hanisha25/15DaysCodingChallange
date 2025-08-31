class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> subsets(int[] nums) {
        list=new ArrayList<>();
        rec(nums,0,new ArrayList<>());
        return list;
    }
    public void rec(int[] nums,int idx,List<Integer> ans)
    {
        list.add(new ArrayList<>(ans));
        for(int i=idx;i<nums.length;i++)
        {
            ans.add(nums[i]);
            rec(nums,i+1,ans);
            ans.remove(ans.size()-1);
        }
    }
}