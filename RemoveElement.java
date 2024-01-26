public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        System.out.println(removeElement(arr, 2));
    }
}
