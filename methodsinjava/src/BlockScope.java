public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        String name = "Prateek";
        {
            //    int a = 10; //already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; //proof that we are not creating a new one we're just reassigning the origin ref var to other var
            int c = 15;
            //values initialised in this block will remain in this block
            System.out.println(a);
            name = "rahul";
            System.out.println(name);
            System.out.println(c);    //100
        }
        int c = 500;
        System.out.println(a); //cuz ek baar agar reassign ho gya toh updated wala hi rahega
        name="Prateek";
        System.out.println(name);
        System.out.println(c); //cannot use outside the block
        }
    }
