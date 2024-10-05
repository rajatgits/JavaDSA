import javax.imageio.ImageTranscoder;

public class ReverseNumber {
    public static void main(String[] args) {
        int ans = reverseNumber(12345);
        System.out.println(ans);
    }

    static int reverseNumber(int num) {
        int digit = (int) (1+ Math.log10(num));
        return helper(num, digit);
    }

    static int helper(int num, int digit){
        if(num%10 == num){
            return num;
        }

        int rem = num%10;

        return rem * (int) (Math.pow(10,digit-1)) + helper(num/10, digit-1);
    }
}
