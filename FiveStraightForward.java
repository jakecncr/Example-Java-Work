class SimpleChallenges {

    // Create a method that takes a string and returns the word count. The string will be a sentence.

    public static int countWords(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                wordCount++;
            }
        }
        return wordCount;
    }

    /* Create a function that takes two strings and returns true if the first string ends with the second string;
     otherwise return false. */

    public static boolean checkEnding(String str1, String str2) {
        if (str1.endsWith(str2)){
            return true;
        } else {
            return false;
        }
    }

    // Write a function that gives the number of dots with its corresponding triangle number of the sequence.

    public static int triangle(int n) {
        return n*(n+1)/2;
    }

    /* Create a method that accepts a string (of a person's first and last name) and returns
    a string with the first and last name swapped. */

    public static String nameShuffle(String s) {
        String firstName = s.substring(0, s.indexOf(" "));
        String lastName = s.substring(s.indexOf(" "));
        String solution =  lastName.trim() + " " + firstName;
        return solution;
    }

    // Write a function that returns true if two rooks can attack each other, and false otherwise.

    public static boolean canCapture(String[] rooks) {
        return rooks[0].charAt(0) == rooks[1].charAt(0)
                || rooks[0].charAt(1) == rooks[1].charAt(1);
    }

}