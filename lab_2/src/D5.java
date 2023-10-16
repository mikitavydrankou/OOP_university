public class D5 {
    public static void main(String[] args) {
        System.out.println(d5(-1015));
    }
    public static boolean d5(int n){

        boolean b1 = n % 2 != 0;
        boolean b2 = n >= -9999 && n <= -1000;
        boolean b3 = n % 5 == 0;

        if(b1 && b2 && b3)
        {
            System.out.println("N = " + n);
            return true;
        }
        return false;
    }
}
