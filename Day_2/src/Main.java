import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mảng 1 chiều,
        //Mảng 2 chiều (tĩnh)
        //String
        //Phương thức tĩnh (hàm)
        //Hằng
        //Wrapper
        //Git và GitHub

        Scanner scan = new Scanner(System.in);
        //Khởi tạo mảng
//        int[] arr;
//        int n;
//        n = scan.nextInt();
//        arr = new int[n];
//
//        arr[0] = 100;
//        float[] arr2 = new float[10];
//        int[] values = {1, 2, 3, 4, 5};
//        arr2[2] = 18;

        //Nhập mảng
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }

        //Xuất mảng với for i
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        //Xuất mảng với foreach
//        for(int num : arr){
//            System.out.print(num + " ");
//            System.out.print(--num);
//            System.out.println();
//        }

        //Xuất mảng với hàm hỗ trợ của Java
//        System.out.println(Arrays.toString(arr));

        // Xóa phần tử trong mảng
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == 5){
//                for(int j = i; j < n - 1; j++){
//                    arr[j] = arr[j + 1];
//                }
//                n--;
//                i--;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for(int num : arr){
//            System.out.print(num + " ");
//        }

        // Chèn phần tử vào mảng
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1; j > i; j--) {
//                arr[j] = arr[j - 1];
//            }
//        }

        //Viết chương trình xóa các phần tử chẵn trong mảng và chèn giá trị 0 trước các phần tử là số 5
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }

        for(int num : nums){
            System.out.print(num + " ");
        }

        for (int i = 0; i < n; i++) {
            if(nums[i] % 2 == 0){
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
                i--;
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == 5){
                for (int j = n - 1; j > i ; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[i] = 0;
                n++;
                i++;
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}