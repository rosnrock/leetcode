package easy;

// https://leetcode.com/problems/add-binary/description/
public class AddBinary {
    public String addBinary(String a, String b) {

//        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));

        if (a.length() > b.length())
            b = "0".repeat(a.length() - b.length()) + b;
        if (b.length() > a.length())
            a = "0".repeat(b.length() - a.length()) + a;

        StringBuilder answer = new StringBuilder();

        int reminder = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                answer.append(reminder == 0 ? "0" : "1");
                reminder = 1;
            } else if (a.charAt(i) == '1' || b.charAt(i) == '1') {
                answer.append(reminder == 0 ? "1" : "0");
            } else {
                answer.append(reminder == 0 ? "0" : "1");
                reminder = 0;
            }
        }

        answer.append(reminder == 1 ? "1" : "");

        return answer.reverse().toString();
    }
}
