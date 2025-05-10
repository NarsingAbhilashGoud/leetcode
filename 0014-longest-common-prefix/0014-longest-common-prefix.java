public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as the reference
        String prefix = strs[0];
        
        // Compare it with the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Keep shortening the prefix until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If there's no common prefix, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

}