public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        String name = "Prateek";
        {
            //    int a = 10;           //already initialised outside the block , hence you cannot initialise again
            a = 100;                    //we're just reassigning the origin ref var to other var (updating)
            int c = 15;                 //values initialised in this block will remain in this block
            System.out.println(a);      //100
            name = "rahul";
            System.out.println(name);   //rahul
            System.out.println(c);      //15
        }
        int c = 500;            //earlier was intialised inside the block that's why reassigning.
        System.out.println(a);  //100-->cuz ek baar agar reassign ho gya toh updated wala hi rahega
        name="Prateek";         //can be updated outside the block **
        System.out.println(name);//Prateek
        System.out.println(c); //500
        }
    }
