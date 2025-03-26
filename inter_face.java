interface pitable{
    void print();
}
class inter_face implements pitable{
    public void print(){
        System.out.println("hello");
    }
    public static void main(String args[]){
     inter_face k = new inter_face();
     k.print();
    }
}
