package code;

public class Message {
    //print the hello world message 5 time
    static void main(String[] args) {
        message1(); // start the chain of calls
    }
    static void message1(){
        System.out.println("hello world"); // 1st print
        message2();                        //call 2nd method
    }
    static void message2(){
        System.out.println("hello world"); //2nd print
        message3();                        //call 3rd method
    }
    static void message3(){
        System.out.println("hello world");  //3rd print
        message4();                         //call 4th method
    }
    static void message4(){
        System.out.println("hello world");  //4th print
        message5();                         //call 5th method
    }
    static void message5(){
        System.out.println("hello world");  //5th print(final)
    }
}
