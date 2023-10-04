class Solution {
    public int romanToDecimal(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int count = 0;
        int n = str.length();
        if (n == 1){
            return (hm.get(str.charAt(0)));
        }else{
            for (int i = 0; i < n-1 ; i++){
                if (hm.get(str.charAt(i)) >= hm.get(str.charAt(i+1))){
                    count+=hm.get(str.charAt(i));
                }
                else {
                    count-=hm.get(str.charAt(i));
                }
            }
        }
        return (count+hm.get(str.charAt(n-1)));
    }
}
