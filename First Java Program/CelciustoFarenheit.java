import java.util.Scanner;

public class CelciustoFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select 1 for Celcius to Farenheit and 2 for Farenheit to Celcius:");
        int n= input.nextInt();
        if(n==1 || n==2){
        if(n==1){
            System.out.println("Enter the Temp in Celcius:");
            float c= input.nextFloat();
            float f= (c*9/5)+32;
            System.out.println("Temperature in Farenheit is " + f);
        }
        if(n==2) {
            System.out.println("Enter the Temp in Farenheit:");
            float f = input.nextFloat();
            float c = (f - 32) * 5 / 9;
            System.out.println("Temperature in Celcius is " + c);
        }
        }
        else{
            System.out.println("wrong number entered");
        }
    }
}
