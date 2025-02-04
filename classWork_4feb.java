// import java.util.*;
// public class classWork_4feb {
//     public static void main(String[] args) {
//         String str="this is a word and i m a legend";
//         String split[]=str.split(" ");
//         String replaceWith="an";
//         String wordToReplace="a";
//         StringBuilder sb=new StringBuilder();
//         for(String st:split){
//             if(st.equals(wordToReplace)){
//                 sb.append(replaceWith+" ");
//             }else{
//                 sb.append(st+" ");
//             }
//         }
//         System.out.print(sb.toString().trim());
//     }
// }

// ----------------------- Line comparison -----------------------------

import java.util.*;

public class classWork_4feb {

  public static void main(String[] args) {
    String str = "this is a word and i m a legend";
    String s = "this is my second sgtring";
    int len1 = 0;
    int len2 = 0;
    for (char ch : str.toCharArray()) {
      len1++;
    }
    for (char ch : s.toCharArray()) {
      len2++;
    }
    if (len1 > len2) {
      System.out.print(str);
    } else {
      System.out.print(str);
    }
  }
}
