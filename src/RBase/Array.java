package RBase;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};

//        for (int i = 0; i <= arr.length; i++){
//            System.out.println(i);
//        }
//        for (int i: arr){
//            System.out.println(i);
//        }

        // Q. Search the element in an DataType.Array

//        for (int i : arr) {
//            if (i == 3) {
//                System.out.println("Found");
//            }
//        }


        // Q. Find max element

//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 140;
//        arr[2] = 30;
//        arr[3] = -10;
//        arr[4] = 0;
//        int res = Integer.MIN_VALUE;
//
//        for (int i=0; i < arr.length; i++) {
//            if (arr[i] > res) {
//                res = arr[i];
//            }
//        }
//        System.out.println(res);


        // Q. Reverse print an array

//        for (int i = arr.length; i >=0; i--){
//            System.out.print(i);
//            System.out.print(" ");
//        }


        // Q. Sum of an array

//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);


        // 2D DataType.Array

//        int[][] arr = new int[3][3];
        int[][] nums = {
                {1, 5, 6},
                {5, 8, 3},
                {8, 1, 3}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            };
            System.out.println(" ");
        }


    }
}