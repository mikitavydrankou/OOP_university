import java.util.ArrayList;

public class G8 {
    public static int countZeros(ArrayList<Integer>arg){
        int count = 0;
        for (int i = 0; i < arg.size(); i++){
            if (arg.get(i) == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer>myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(0);
        myList.add(3);
        myList.add(0);
        myList.add(4);

        ArrayList<Integer>myList2 = new ArrayList<>();
        myList2.add(0);
        myList2.add(1);
        myList2.add(0);
        myList2.add(0);
        myList2.add(0);
        myList2.add(0);
        myList2.add(4);


        int wynik = countZeros(myList);
        int wynik2 = countZeros(myList2);

        System.out.println("Wynik = " + wynik);
        System.out.println("Wynik2 = " + wynik2);
    }
}
