package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human rakheeb=new Human(20,"rakheeb",10000,false);
        Human ashu=new Human(20,"ashu",10000,true);

        System.out.println(Human.population);//static variables did not dependent on variables
        System.out.println(Human.population);//static variables did not dependent on variables
    }
}
