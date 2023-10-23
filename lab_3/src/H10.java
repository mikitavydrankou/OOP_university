public class H10 {
    public static void main(String[] args) {
        String input = "bananowy";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        System.out.println(result.toString());
    }

}
