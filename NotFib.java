public class NotFib {
    public static long[] notFibonacci(int input) {
        long first = 0;
        long second = 1;
        long[] arr = new long[input];
        if(input == 0) {
            arr[0] = 0;
        } else if (input >= 1) {
            arr[0] = 0;
            arr[1] = 1;
        }
        for(int i = 2; i < input; i++) {
            //this is how to get the result on the assignment 1 pdf example
            long next = ((first * 3) + (second * 2));
            first = second;
            second = next;
            arr[i] = next;

            //this is how to compute based on the formula given in the pdf
            /*
            long next = ((first * 2) + (second * 3));
            first = second;
            second = next;
            arr[i] = next;
             */
        }
        return arr;
    }
    public static void main(String[] args) {
        long[] answer = notFibonacci(51);
        for(long num: answer) {
            System.out.println(num);
        }
    }
}
