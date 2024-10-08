package string;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        ArrayList<String> ans = subsequence1("", "abc");
        System.out.println(ans);
    }

    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subsequence1(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsequence1(p+ch, up.substring(1));
        ArrayList<String> right = subsequence1(p, up.substring(1));

        list.addAll(left);
        list.addAll(right);
        return left;
    }
}
