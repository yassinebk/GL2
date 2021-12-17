class ChaineEtPalindrome {
    private String str;

    ChaineEtPalindrome(String str) {
        this.str = str;
    }

    String Inverse() {
        String tempString = "";
        for (int i = 0; i < str.length(); i++) {
            tempString = tempString + (str.charAt(str.length()-1-i));
        }
        str = tempString;
        return str;
    }

    boolean estPalindrome() {
        for (int i = 0; i < str.length(); i++)

        {
            if (i == str.length() - 1 - i)
                break;
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
