package Week1_2;
class Demo {
    
    Demo(String name , int price){
        this(price) ; 
        System.out.println("name : "+name) ; 
    }
    
    Demo(int price){
        this("Honda") ; 
        System.out.println("Price: "+price) ; 
    }
    
    Demo(String brand){
        System.out.println("Brand: "+brand) ; 
    }
  }
    
  class Main extends Demo {
    Main(int price){
      super("default brand") ; 
        System.out.println("Price: "+price) ; 
    }
    
    Main(String name , int Price){
      super(89000); 
        // this(20000);  
        System.out.println("Name: "+name) ; 
    }
    Main(double speed){
        this(900) ; 
        System.out.println("Speed: "+speed) ; 
    }
}
class ConstructorChaining {
        public static void main(String[] args){
     // Truck t = new Truck("Ashok", 200000);  
     Main t = new Main("Ashok" , 10000);
    }
        
}
