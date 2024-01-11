package swapowe;

public class swap {

    public static <T> void swap(T[] myArr, int x, int y){
        if(x>=myArr.length || y>=myArr.length){
            return;
        }
        T amp = myArr[x];
        myArr[x] = myArr[y];
        myArr[y] = amp;

        for(T t : myArr){
            System.out.println(t);
        }

    }


    public static void main(String[] args) {
        Integer[] tablica = {4, 5, 6, 7, 5};
        swap(tablica, 3, 4);


    }
}


