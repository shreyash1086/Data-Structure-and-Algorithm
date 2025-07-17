package Learning.String_StringBuilder;

public class StringBuilderTut {
    public static void main(String[] args) {
        // String builder is mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        System.out.println(builder.reverse());

        System.out.println(builder.indexOf("a"));
        System.out.println(builder.length());
        builder.setCharAt(0,'s');
        System.out.println(builder);
    }
}
