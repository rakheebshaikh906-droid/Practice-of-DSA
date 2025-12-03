package code.rakheeb;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String name = "Asim";

        {
            // block scope

            // int a = 34;
            // this will give error
            // because it is already initialised outside
            //the block in the same method hence you can
            // not initialised again
            a = 100;
            // reassign the origin ref variable to some other variable
            int c = 50;
            // value initialised in the block, will remain in the block
            System.out.println(c);// this we cant use outside the block
            name ="Shuja"; // orignal name will be change

        }
        //scoping in for loop
        for (int i = 0; i < 4; i++) {
            int num =56;
            a = 1234;
            System.out.println(num);

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

    }
}
