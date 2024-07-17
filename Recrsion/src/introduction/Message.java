package introduction;

public class Message {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("hello world");
        message1();
    }
    static void message1(){
        System.out.println("hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
        end("the end"); //passing the parameter
    }
    static void end(String n){
        System.out.println(n);
    }
}
