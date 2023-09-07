class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        if(word1.length==0||word2.length==0){
            return false;
        }
        for (int i = 0; i < word1.length; i++) {
             
            s1=s1.concat(word1[i]);
            
        }
        for (int i = 0; i < word2.length; i++) {
             
            s2=s2.concat(word2[i]);
            
        }
        if(s2.equals(s1)){
            return true;
        }

     return false;
    }
}