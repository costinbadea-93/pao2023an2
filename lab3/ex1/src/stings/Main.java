package stings;

public class Main {
    public static void main(String[] args) {
        String s1 = "my string";
        s1.concat("1");

        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("my string");
        s2.append("1");

        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("my string");
        s3.append("1");

        System.out.println(s3);

    }
}
