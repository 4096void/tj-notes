// https://leetcode.com/problems/valid-palindrome/

class Solution {
  public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0) return true;

    for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
      while (i < j && !isAlphaNumeric(s.charAt(i))) ++i;
      while (i < j && !isAlphaNumeric(s.charAt(j))) --j;
      if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
    }

    return true;
  }

  private boolean isAlphaNumeric(char c) {
    return (c >= 'a' && c <= 'z')
      || (c >= 'A' && c <= 'Z')
      || (c >= '0' && c <= '9');
  }

  private boolean isEqualIgnoreCase(char c1, char c2) {
    if (c1 >= 'A' && c1 <= 'Z') c1 += 32;
    if (c2 >= 'A' && c2 <= 'Z') c2 += 32;
    return c1 == c2;
  }
}
