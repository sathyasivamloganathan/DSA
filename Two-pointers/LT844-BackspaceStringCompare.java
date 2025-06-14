class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first = BackSpace(s);
        String second = BackSpace(t);
        if(first.equals(second)) {
            return true;
        }
        return false;
    }
    public static String BackSpace(String a) {
        if(a.length() == 1 && a.charAt(0) != '#') {
            return a;
        } else if(a.length() == 1 && a.charAt(0) == '#') {
            return "";
        }
        StringBuilder build = new StringBuilder();
	    int i=0;
        while(i < a.length()) {
	        if(a.charAt(i) != '#') {
	            build.append(a.charAt(i));
	        } else if(a.charAt(i) == '#' && build.length() >= 1) {
                build.deleteCharAt(build.length() - 1);
	        }
	        i++;
	    }
        return build.toString();
	}
}


// Time complexity O(n + m)


// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".
// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".
// Example 3:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".