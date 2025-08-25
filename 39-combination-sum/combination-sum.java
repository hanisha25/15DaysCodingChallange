class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        sum(candidates,0,0,target,new ArrayList<>());
        return res;
    }
    public void sum(int[] candidates,int idx,int sum, int target,ArrayList<Integer> list)
    {
        if(idx==candidates.length && sum==target)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(idx==candidates.length || sum>target)
        {
            return;
        }
        list.add(candidates[idx]);
        sum(candidates,idx,sum+candidates[idx],target,list);
        list.remove(list.size()-1);
        sum(candidates,idx+1,sum,target,list);
    }
}