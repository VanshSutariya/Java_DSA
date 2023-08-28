class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for( int k:map.values()){
            if(!set.contains(k)){
                set.add(k);
            }
            else{
                return false;
            }
        }
         return true;
    }
}