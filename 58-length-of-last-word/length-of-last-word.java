class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
    
        if(s.contains(" ")){
            char [] str = s.toCharArray();
            int length=0;

        for(int i=str.length-1;i>0;i--){
            if(str[i]!=' '){
                length++;
            }
            else{
                return length;
            }
        }
        }
        else{
            
            return s.length();
        }
        return -1;
        
    }
}