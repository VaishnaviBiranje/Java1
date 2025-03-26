class animal{
    void eat(){
        System.out.println("eatting....");
    }
}
class dog extends annimal{
    void bark(){
         System.out.println("barking....");
    }
}
class cat extends animal{
     void mow(){
         System.out.println("mow-mow....");
    }
}
 class hyrchical{
    public static void main(String args[]){
    cat c = new cat();
    c.mow();
    c.eat();
    }
    
}