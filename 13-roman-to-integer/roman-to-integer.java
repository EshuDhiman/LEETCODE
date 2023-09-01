class Solution {
    public int romanToInt(String s) {
       HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);     
        // char[] key = s.toCharArray();
        
        int sum = 0;
        for (int i = 0,j=1; i < s.length(); i++) {
            String a = s.substring(i, j);
            System.out.print(a);
            if(map.containsKey(a)){
                sum=sum+map.get(a);
            }
            j++; 
        }
        if (s.contains("IV")) {
            sum=sum-2;
        }
        if (s.contains("IX")) {
            sum=sum-2;
        }
        if (s.contains("XL")) {
            sum=sum-20;
        }
        if (s.contains("XC")) {
            sum=sum-20;
        }
        if (s.contains("CD")) {
            sum=sum-200;
        }
        if (s.contains("CM")) {
            sum=sum-200;
        }
        // System.out.println(sum);
        return sum;
        
    }
}