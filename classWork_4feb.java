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
    Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
         double d1 = Math.sqrt(x1*x1 + y1*y1);
        double d2 = Math.sqrt(x2*x2 + y2*y2);
        if (d1 > d2) {
            System.out.println("(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ")");
        }
  }
}
