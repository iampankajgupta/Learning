//import java.util.concurrent.*;
//
//public class DevClass {
//    public static void main(String[] args) {
//        String s = "cbbd";
//        String ans = palindromicSubstring(s,0,s.length()-1);
//        System.out.println(ans);
//    }
//
//    private static String palindromicSubstring(String s,int i ,int j) {
//        if(i>j) return "";
//        String ans = "";
//        StringBuilder builder = new StringBuilder();
//        if(s.charAt(i)==s.charAt(j)){
//            if(i==j) {
//                ans+=s.charAt(i);
//                return palindromicSubstring(s,i+1,j-1);
//            }
//            return ans+=palindromicSubstring(s,i+1,j-1);
//        }
//        else{
//            int first = palindromicSubstring(s,i+1,j);
//            int second = palindromicSubstring(s,i,j-1);
//            return String.valueOf(Math.max(first,second));
//        }
//
//
//
//    }
//}
