class annimal{
    void eat(){
        System.out.println("eatting....");
    }
}
class dog extends annimal{
    void bark(){
         System.out.println("barking....");
    }
}
class babydog extends dog{
    void weeping(){
        System.out.println("weeping...");
    }

}
class multin{
    public static void main(String args[]){
        babydog b=new babydog();
        b.weeping();
        b.bark();
        b.eat();
    }
}