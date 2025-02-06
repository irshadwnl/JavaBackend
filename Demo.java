class Demo {
    
    Demo(String name , int price){
        this("Honda");  
        System.out.println("name : "+name);
    }
    
    Demo(int price){
        this("Honda");  
        System.out.println("Price: "+price);
    }
    
    Demo(String brand){
        System.out.println("Brand: "+brand);
    }
}

class Truck extends Demo {
    Truck(int price){
        super("default brand");  
        System.out.println("Price: "+price);
    }
    
    Truck(String name , int price){
        super(89000); 
        System.out.println("Name: "+name);
    }

    Truck(double speed){
        this(900);  
        System.out.println("Speed: "+speed);
    }
    
    public static void main(String[] args){
        Truck t = new Truck("Ashok", 200000);  
    }
}
