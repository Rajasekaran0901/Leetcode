class Solution 
{
    public boolean isPalindrome(String s)
    {
        s  = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       StringBuilder sc = new StringBuilder(s);
       String a = sc.reverse().toString();
       if (s.equals(a)) return true;
       else return false;
    }
 }
