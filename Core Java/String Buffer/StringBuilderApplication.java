package string;

public class StringBuilderApplication {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder ");
        sb.append("is a peer class of String ");
        sb.append("that provides much of ");
        sb.append("the functionality of strings ");
        System.out.println(sb);

        StringBuilder str = new StringBuilder("It is used to _ at the specified index position");
        str.replace(14,15,"insert text");
        System.out.println(str);

        StringBuilder sr = new StringBuilder("This method return the reversed object on which it was called");
        sr.reverse();
        System.out.println(sr);
    }
}
