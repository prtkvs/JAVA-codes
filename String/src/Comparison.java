public class Comparison {
    public static void main(String[] args) {
    String a = "kunal";
    String b = "kunal";
        System.out.println(a==b);//TRUE //since both are pointing to same object,
        // it is due to the fact of String pool and immutability.
        //it will give false when it will create different objects of same value,
        // i.e created in different stack and heap memory.
        String name1 = new String("kunal");
        String name2 = new String("kunal");
        System.out.println(name1==name2); //FALSE //here in this case different object
        // is created of same value.
        System.out.println(name1.equals(name2)); //.equal detects only value
        // whether it is at different memory(object) .equals method helps us
        // to get the value only without considering objects.
    }
}
