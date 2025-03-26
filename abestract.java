abstract class shape{
    abstract void draw();
} 
class rectangle extends shape{
    void draw(){
        System.out.println("drawing rectangle!");

    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing circle!");

    }
}
class abestract{
    public static void main(String args[]){
    circle c = new circle();
    c.draw();
}
}
