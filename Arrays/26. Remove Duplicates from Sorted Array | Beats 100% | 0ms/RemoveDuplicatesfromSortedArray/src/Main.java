import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums){
        int temp = nums[0];
        int counter = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == temp){

            }else{
                temp = nums[i];
                nums[counter] = temp;
                counter++;
            }
        }
        return counter;
    }
}