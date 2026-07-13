package Properties.inheritance;

public class Main {
    static void main(String[] args) {
        //Box box=new Box();
        //Box box=new Box(4.4,4.6,3.5);


       // System.out.println(box.l+" "+box.h+" "+box.w);


        //BoxWeight box1=new BoxWeight();
       // System.out.println(box1.weight+" "+ box1.h);

        BoxWeight box2=new BoxWeight(2.3,4.5,2.7,4.9);
        System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight);
    }
}
