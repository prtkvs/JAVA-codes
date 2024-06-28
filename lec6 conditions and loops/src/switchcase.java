import java.util.Scanner;//this is must require for putting a scan function

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fruit name:");
        String fruit = input.next();
        //press alt+enter in switch for enhanced switch
        // if we will not put break it will keep going till default statement or till where break statement is not given
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruit!");
                break;
            case "Apple":
                System.out.println("sweet red fruit!");
                break;
            case "Pineapple":
                System.out.println("refreshment as a juice!");
                break;
            case "Orange":
                System.out.println("high vitamin C!");
                break;
            case "Banana":
                System.out.println("rich in carbs!");
                break;
            default:
                System.out.println("enter a valid fruit");
                break;
        }
    }
}
