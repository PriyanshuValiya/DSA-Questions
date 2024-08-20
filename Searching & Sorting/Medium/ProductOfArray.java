// https://www.geeksforgeeks.org/a-product-array-puzzle

public class ProductOfArray {
    public static void getProduct(int arr[]) {
        int newArr[] = new int[arr.length];
        int flag = 1;       

        for(int i=0; i < arr.length; i++) {
            newArr[i] = flag;
            flag *= arr[i];
        } // newArr = 1 1 2 6 24 

        flag = 1;

        for(int i=arr.length-1; i >= 0; i--) {
            newArr[i] *= flag;
            flag *= arr[i];
        } // newArr = 120 60 40 30 24

        for(int i=0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        getProduct(arr);
    }
}
