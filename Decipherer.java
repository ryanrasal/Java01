public class Decipherer {
    public static void decipher(String message) {
        int keyNumber = (message.length() + 1) / 2;
        String substring = message.substring(5, 5 + keyNumber);
        String replacedString = substring.replaceAll("[@#?]", " ");
        String reversed = new StringBuilder(replacedString).reverse().toString();
         System.out.println(reversed);
    }

    public static void main(String[] args) {
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        decipher(message1);
        decipher(message2);
        decipher(message3);
    }
}
