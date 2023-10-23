import java.util.ArrayList;

public class G4 {
    public static int minimumValue(ArrayList<Integer>arg){
        if(arg.isEmpty()){
            return 0;
        }

        int min = arg.get(0);

        for(int i = 1; i < arg.size(); i++){
            int current = arg.get(i);
            if(current < min){
                min = current;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(10);
        myList.add(3);
        myList.add(4);

        ArrayList<Integer> myList2 = new ArrayList<>();

        int minValue = minimumValue(myList);
        int minValue2 = minimumValue(myList2);

        System.out.println("Minimal value = " + minValue);
        System.out.println("Minimal value = " + minValue2);
    }
}
