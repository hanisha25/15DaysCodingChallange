class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       res=new ArrayList<>();
       Arrays.sort(nums);
       backtracking(nums,0,new ArrayList<>());
       return res;
    }
    public void backtracking(int[] nums,int idx,ArrayList<Integer> list)
    {
        res.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            backtracking(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}