public class zadanie {
    public static <T> boolean isEqual(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        } else if (obj1 == null || obj2 == null) {
            return false;
        } else {
            return obj1.equals(obj2);
        }
    }

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        System.out.println("Czy str1 jest równe str2? " + isEqual(str1, str2)); // true
        System.out.println("Czy str1 jest równe str3? " + isEqual(str1, str3)); // false

        Integer num1 = 10;
        Integer num2 = 10;
        Integer num3 = 20;

        System.out.println("Czy num1 jest równe num2? " + isEqual(num1, num2)); // true
        System.out.println("Czy num1 jest równe num3? " + isEqual(num1, num3)); // false
    }
}
