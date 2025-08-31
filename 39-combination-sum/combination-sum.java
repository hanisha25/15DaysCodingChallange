class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        recursion(candidates,0,0,target,new ArrayList<>());
        return res;
    }
    public void recursion(int[] candidates,int idx,int sum, int target,List<Integer> list)
    {
        if(idx==candidates.length && sum==target)
        {
            res.add(new ArrayList<>(list));
        }
        if(sum>target) return;
        if(idx==candidates.length) return;
        list.add(candidates[idx]);
        recursion(candidates,idx,sum+candidates[idx],target,list);
        list.remove(list.size()-1);
        recursion(candidates,idx+1,sum,target,list);
    }
}