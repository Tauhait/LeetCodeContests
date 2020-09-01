package august;

public class DetectCapitalUse {
	public boolean detectCapitalUse(String word) {
        if(word == null) return false;
        if(word.length() <= 1) return true;
        int firstChar = (int)word.charAt(0);
        if(firstChar >= 97 && firstChar <= 122) {
            for(int i = 1; i < word.length(); i++) {
                char currChar = word.charAt(i);
                if(currChar < 97 || currChar > 122) return false;
            }
            return true;                
        }else {
            int secondChar = (int)word.charAt(1);
            int range = secondChar >= 65 && secondChar <= 90 ? 65 : 97;            
            for(int i = 1; i < word.length(); i++) {
                char currChar = word.charAt(i);
                if(currChar < range || currChar > (range + 25)) return false;
            }
            return true;
        }
    }
}
