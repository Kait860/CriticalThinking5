import java.util.Scanner;

class ProductRecursion {
    public static int product(int[] nums, int amount){
        if(amount == nums.length){
            return 0;
        }
        else{
            return nums[amount] * product(nums, amount + 1);
        }

    }
        public static void main(String[] args) throws Exception {
            Scanner scnr = new Scanner(System.in);
            int[] nums = new int[4];
            int count = 0;
            System.out.println("Output five numbers to find their product: ");
            while(nums[count] = scnr.hasNextInt();){


            }
            //for(int i =0; i < 5; i++){
            //    nums[i] = scnr.nextInt();
            //}
            scnr.close();
            System.out.println("The product of those numbers is: " + product(nums, 5));
        }
}
