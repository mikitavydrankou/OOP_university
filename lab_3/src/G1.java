import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(1);
        lt.add(0);
        lt.add(3);
        lt.add(-10);
        lt.add(30);
        lt.add(-2);
        lt.add(6);
        lt.add(20);
        lt.add(-3);
        lt.add(-6);

        System.out.println(lt);

        for(int i = lt.size()-1; i>=0; i--){
            System.out.println(lt.get(i));
        }
    }
}
