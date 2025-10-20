class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr=sentence.split(" ");
        HashSet<String> set=new HashSet<>();
        for(String d:dictionary)
        {
            set.add(d);
        }
        for(int i=0;i<arr.length;i++)
        {
            String a=arr[i];
            StringBuilder sb=new StringBuilder("");
            for(char ch:a.toCharArray())
            {
                sb.append(ch);
                if(set.contains(sb.toString()))
                {
                    arr[i]=sb.toString();
                    break;
                }
            }
        }
        return String.join(" ", arr);
    }
}