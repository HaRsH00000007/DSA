public class L_String_Duplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // B A S E C A S E
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) { // If this value comes TRUE then it means it's a duplicate value.
            // Removing Duplicates value
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true; // If this value comes FALSE then it means we have to append this value in our map.
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String args[]) {
        String str = "hhhaayyggbnd";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
