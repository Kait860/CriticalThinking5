import java.util.Scanner;

class ProductRecursion {
    //method to find product
    public static int product(int[] nums, int amount){
        //base case
        if(amount == 1){
            return nums[0];
        }
        //recursive case
        return nums[amount - 1] * product(nums, amount -1);
    }

    //main method
    public static void main(String[] args) throws Exception {
        //initializes variables
        Scanner scnr = new Scanner(System.in);
        int[] nums = new int[5];

        //prompts user for five numbers and scans them
        System.out.println("Input five numbers to find their product: ");
        for(int i = 0; i < 5; i++){
            if(scnr.hasNextInt()){
                nums[i] = scnr.nextInt();
            }
            else{
                System.out.println("Please input the correct number amount.");
            }
        }

        scnr.close();

        System.out.println("The product of those numbers is: " + product(nums, 5));
    }
}
