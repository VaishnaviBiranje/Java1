class vechial{
    void run(){
        System.out.println("vechical running!");
    }
}
class bike{
    void fle(){
        System.out.println("bike is faster!");
    }
}
class car extends bike{
 void fle(){
        System.out.println("more is faster than bike!");
    }
}
class overidding{
    public static void main(String args[]){
        car c=new car();
        c.fle();
    }
}