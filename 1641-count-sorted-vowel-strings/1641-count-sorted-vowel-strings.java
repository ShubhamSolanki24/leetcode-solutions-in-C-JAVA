class Solution {
    char[] ch = new char[]{'a','e','i','o','u'} ;
    public int countVowelStrings(int n) {
      int ans =0;
        for(char c:ch){
            ans+=count(n-1,c);
        }
        return ans;
    }
    
    int count(int length,char last_char){
        if(length==0){
            return 1;
        }
        int temp =0;
        for(char c:ch){
            if(last_char>=c){
                temp+= count(length-1,c);
            }
        }
        return temp;
    }
    
}