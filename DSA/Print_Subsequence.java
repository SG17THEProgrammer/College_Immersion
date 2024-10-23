public class Print_Subsequence{

    public static void print(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char charAtZero = ques.charAt(0);
        print(ques.substring(1),ans); // jab nhi liye 
        // ques.substring(1) --> bc aayega 
        print(ques.substring(1),ans+charAtZero); // jab liya hai 

    }
    public static void main(String[] args) {
        String ques = "abc";
        print(ques,"");
    }
}