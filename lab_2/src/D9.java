public class D9 {
    public static void main(String[] args) {
        System.out.println(d9(10,5));
        System.out.println(d9(10,-1));
        System.out.println(d9(4,1));
    }

    public static int d9(int n, int k){

        if(n < 0 && k < 0){
            return 0;
        }

        int n_fact = 1;
        for(int i = 1; i <= n; i++){
            n_fact = n_fact * i;
        }

        int k_fact = 1;
        for(int i = 1; i <= k; i++){
            k_fact = k_fact * i;
        }

        int n_k_fact = 1;
        for(int i = 1; i <= n-k; i++){
            n_k_fact = n_k_fact * i;
        }

        int result = n_fact/(k_fact*n_k_fact);

        return result;
    }
}
