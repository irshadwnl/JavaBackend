package Week1_2;
public class staticKeyWord {
    public static class employee {
        int empid;
        String name;
        static String company="Capgemini";
        // static void show(){
        //     System.out.println("hello");
        // }
        public employee(int empid,String name){
            this.empid=empid;
            this.name=name;
        }

        void display(){
            System.out.println(empid+", "+ name+", "+company);
        }
    }    
    public static void main(String[] args) {
        employee e1=new employee(1, "Irshad");
        e1.display();
    }
}
