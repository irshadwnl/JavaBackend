import java.util.*;
public class classWork_4feb {
    public static void main(String[] args) {
        String str="this is a word and i m a legend";
        String split[]=str.split(" ");
        String replaceWith="an";
        String wordToReplace="a";
        StringBuilder sb=new StringBuilder();
        for(String st:split){
            if(st.equals(wordToReplace)){
                sb.append(replaceWith+" ");
            }else{
                sb.append(st+" ");
            }
        }
        System.out.print(sb.toString().trim());
    }
}
