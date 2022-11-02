public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(help(arr));
    }

    public static String help(String[] strs) {
        StringBuilder StringBuilder = new StringBuilder();
        // if null just return empty string
        if (strs == null || strs.length == 0) {
            return StringBuilder.toString();
        }
        // Find the minimum length string from the array
        int minLength = strs[0].length();

        for (String s : strs) {
            // Get the current character from first string
            minLength = Math.min(minLength, s.length());
        }
        for (int i = 0; i < minLength; ++i) {
            // checks if this char is found in
            // other words
            char current = strs[0].charAt(i);

            // Check if this character is found in all other strings or not
            // looping through the other words
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return StringBuilder.toString();
                }
            }
            // add to current list. 
            StringBuilder.append(current);
        }
        return StringBuilder.toString();
    }
}

