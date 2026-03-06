package RBase;

public class While {
    public static void main(String[] args) {
        int n = 5159197;
        int res = 0;

        while(n > 0){
            n = n/10;
            res ++;
        }
        System.out.println(res);

    }
}
