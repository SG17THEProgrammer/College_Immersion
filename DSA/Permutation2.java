public class Permutation2 {
    public static void Print(String ques , String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            if(hasCharacter(ch, s2)==false){
                Print(s1+s2,ch+ans);
            }
        }
    }

    public static boolean hasCharacter(char ch , String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abca";
        Print(s,"");
    }
}
