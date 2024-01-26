public class whereSequence extends NotFib {
    public static int whereInSequence(long x) {
        int answer = -1;
        int n = 51;
        long[] result = notFibonacci(n);
        for(int i = 0; i < n; i++) {
            if(result[i] > x) {
               answer = i;
               break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(whereInSequence(680425538102168944L));
    }
}
