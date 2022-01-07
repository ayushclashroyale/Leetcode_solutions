class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int i=0,j=n-1;
        while(i<=j){
            if(!((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')))
            {
                i+=1;
                continue;
            }
            else if(!((s.charAt(j)>='A'&&s.charAt(j)<='Z')||(s.charAt(j)>='0'&&s.charAt(j)<='9')||(s.charAt(j)>='a'&&s.charAt(j)<='z')))
            {
                j-=1;
                continue;
            }
            else{
                if(s.charAt(i)!=s.charAt(j))
                    return(false);
                i+=1;
                j-=1;
            }
        }
        return(true);
    }
}

//https://leetcode.com/problems/valid-palindrome/submissions/
