public class commonSub {
    public static int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length();
        int y = text2.length();
        int[][] arr = new int[x +1][y +1];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(text1.charAt(i) == text2.charAt(j)) {
                    arr[i+1][j+1] = 1 + arr[i][j];
                }
                else {
                    arr[i+1][j+1] = Math.max(arr[i][j+1], arr[i+1][j]);
                }
            }
        }
        return arr[x][y];
    }


    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abc", "abc"));
        System.out.println(longestCommonSubsequence("almanacs", "albatross"));
        System.out.println(longestCommonSubsequence("almanac", "ferris"));

    }
}
