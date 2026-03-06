package RBase;

public class Methods {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        sumOfArray(arr);

        String res = upperFun("   @Allahu-Akbar");
        System.out.printf(res);
        System.out.println(sum(10, 15));

    }
    public static void sumOfArray(int[] arr){
        int res = 0;
        for (int i: arr){
            res += i;
        }
        System.out.println(res);
    }

    public static String upperFun(String str){

        return str.trim().toUpperCase();
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
