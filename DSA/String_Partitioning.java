import java.util.ArrayList;
import java.util.List;

public class String_Partitioning {

    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void partitioning(String ques , List<String> quesList , List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(quesList));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if(isPalindrome(s)){
            quesList.add(s);
                partitioning(ques.substring(i), quesList,ans);
                quesList.remove(quesList.size()-1);
        }}
    }
    public static void main(String[] args) {
        String ques= "nitin";
        List<String> quesList= new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitioning(ques, quesList,ans);
        System.out.println(ans);
    }
}
