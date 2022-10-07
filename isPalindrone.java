public class isPalindrone {
    public static void main(String[] args) {
        boolean set = isPalindrome(44544);
        if(set){
            System.out.println("Yes");
        }
    }
    public static boolean isPalindrome(int x) {
        boolean check = false;
        String s = String.valueOf(x);
        String temp = "";
        for(int i = s.length() - 1; i>=0; --i){
            temp = temp + s.charAt(i);
        }
        if(s.equals(temp)){
            check = true;
        }
        return check;
    }
}
