public class H20 {
    public static StringBuffer trimToSize(StringBuffer sb, int n) {
        if (sb.length() > n) {
            sb.setLength(n);
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuffer testBuffer = new StringBuffer("przykładowy napis do przycięcia.");
        System.out.println("przed przycięciem: " + testBuffer);

        trimToSize(testBuffer, 10);
        System.out.println("po przycięciu do 10 znaków: " + testBuffer);

        trimToSize(testBuffer, 30);
        System.out.println("po próbie przycięcia do 30 znaków: " + testBuffer);
    }
}
