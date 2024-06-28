public class Type_Promotion {
    public static void main(String[] args) {
        //jab ek type apna range exceed krle tb wo promote ho jaata hai into jiska range jyada hai.
        byte b=42;
        short s=1024;
        char c='a';
        int i= 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }


}
