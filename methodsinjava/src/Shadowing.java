public class Shadowing {
    static int x= 90; //this will be shadowed at line 6 //static because it belongs to class rather instance of class
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 45; //the class variable at line 2 is shadowed by this
        System.out.println(x); //45
        fun();
    }
    static void fun(){
        System.out.println(x); //90 --> static value
    }
    }

