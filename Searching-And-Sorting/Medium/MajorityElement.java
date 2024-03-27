// https://www.geeksforgeeks.org/majority-element

public class MajorityElement {
    public static int max(int arr[]) {
        int max = arr[0];

        for(int i=0; i < arr.length; i++) {
            if(max <  arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void getMajorElement(int arr[]) {
        int countArr[] = new int[max(arr) + 1];

        for(int i=0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for(int i=0; i < countArr.length; i++) {
            if(countArr[i] >= countArr.length/2) {
                System.out.println("Output : " + i);
                return;
            }
        }
        System.out.println("No Majority Element");
    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 1, 4, 5};
        getMajorElement(arr);
    }
}
