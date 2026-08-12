// Last updated: 12/08/2026, 18:26:02
class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        // can move any character from any string to any other string any number of times
        // the arrangement inside a string doesn't matter
        // only thing that matters is the (total count of each character % words length)
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        for(int count: map.values()){
            if(count % words.length != 0){
                return false;
            }
        }
        return true;
    }
}