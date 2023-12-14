public interface MyComparator {
    int compare(int a, int b);
}

class TestMyComparator implements MyComparator{
    public int compare(int a, int b){
        if(a < b){
            return -1;
        } else if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }
}
