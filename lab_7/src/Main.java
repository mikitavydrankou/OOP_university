
public class Main {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("aaaaaaaaaaa");
        System.out.println(test);
        CapitalizeEverySecond(test);
        System.out.println(test);
    }

    public static void CapitalizeEverySecond(StringBuilder bld){
        for(int i = 0; i < bld.length(); i+= 2){
            bld.setCharAt(i, Character.toUpperCase(bld.charAt(i)));
        }
    }
}