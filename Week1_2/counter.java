package Week1_2;
public class counter {
    int cnt=0;
    counter(){
        cnt++;
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
    }
}
