package org.lukar;

public class LongestPrefix {

    public static void main(String[] args) {

        //String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"a"};

        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs) {


        String firstItem = strs[0];

        String lastPrefix = "";


        for (int i = 0; i < firstItem.length(); i++) {

            if (checkPrefix(firstItem.substring(0, i+1), strs)) {
                lastPrefix = firstItem.substring(0, i+1);
                continue;
            }
            break;
        }
        return lastPrefix;
    }


    private static boolean checkPrefix(String prefix, String[] strs) {
        int count = 0;

        for (int index = 0; index < strs.length; index++) {

            if (strs[index].startsWith(prefix)) {
                count++;
            }
            if (count == strs.length) {
                return true;
            }
        }
        return false;
    }
}
