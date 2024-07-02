public class Main2 {
    public static void main(String[] args) {
        BST tree = new BST();
      // int[] nums = {7,2,1,4,6,9,3,8,10};
        //tree.populate(nums);
        int[] sorted = {1,2,3,4,5,6,7,8};  //populate will give unbalanced tree for sorted array
          tree.populatedSorted(sorted);
        tree.display();
    }
}
