public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (effectivePolindrome(s)){
                System.out.println(s);
            }
        }
    }
    public static String reverseString(String s){
        String reversedStr = "";
        for (int i = s.length()-1; i >= 0 ; i--){
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }
    public static boolean isPolindrome(String s){
        String rs = reverseString(s);
        if (rs.equals(s)){
            return true;
        }
        return false;
    }
    public static boolean effectivePolindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}