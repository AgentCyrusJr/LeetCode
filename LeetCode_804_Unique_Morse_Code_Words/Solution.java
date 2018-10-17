//link: https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse_code_array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        
        for(String word: words){
            String transformation = "";
            for(char ch : word.toCharArray()){
                transformation += morse_code_array[ch-'a'];
            };
            set.add(transformation);
        }
        return set.size();
    }
}