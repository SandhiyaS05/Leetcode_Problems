class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(var it:candyType){
            set.add(it);
        }
        int diff_candy=set.size();
        int len=candyType.length/2;
        if(diff_candy>len){
            return len;
        }
        else{
            return diff_candy;
        }
    }
}