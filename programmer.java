class employee{
    int salary=120000;
}
class programmer extends employee{
    int bouns=1200;
    public static void main(String args[]){
        programmer p=new programmer();
        System.out.println("progrrammer  salary is: "+p.salary);
        System.out.println("progrrammer bounse:"+p.bouns);
    }
}

