public class SumofDigit {
    public static void main(String[] args) {
        int ans = sumOfDigit(1528);
        System.out.println(ans);
    }

    static int sumOfDigit(int num) {
        if(num==0){
            return 0;
        }

        return num%10 + sumOfDigit(num/10);
    }
}
