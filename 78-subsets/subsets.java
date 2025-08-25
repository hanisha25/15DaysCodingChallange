class Solution {
    List<List<Integer>>  res;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        subset(nums,0,new ArrayList<>());
        return res;
    }
    public void subset(int[] nums,int idx,ArrayList<Integer> list)
    {
       res.add(new ArrayList<>(list));
       for(int i=idx;i<nums.length;i++)
       {
           list.add(nums[i]);
           subset(nums,i+1,list);
           list.remove(list.size()-1);
       }
    }
}