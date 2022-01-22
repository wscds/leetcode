class Solution {
    public int removePalindromeSub(String s) {
        int start = 0, end = s.length() - 1;
        while(end > start){
            if(s.charAt(start) != s.charAt(end))return 2;
            start++;
            end--;
        }
        return 1;
    }
}
