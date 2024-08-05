package Greedy.Easy;

// https://www.geeksforgeeks.org/find-maximum-sum-possible-equal-sum-three-stacks

public class MaxSum {
    public static void getMaxSum(int stack1[], int stack2[], int stack3[]) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int head1 = 0, head2 = 0, head3 = 0;

        for(int i = 0; i < stack1.length; i++) {
            sum1 += stack1[i];
        }
        
        for(int i = 0; i < stack2.length; i++) {
            sum2 += stack2[i];
        }
        
        for(int i = 0; i < stack3.length; i++) {
            sum3 += stack3[i];
        }

        while(true) {
            if(sum1 == sum2 && sum2 == sum3) {
                System.out.println("Max Sum is : " + sum1);
                break;
            } else if(sum1 > sum2 && sum1 > sum3) {
                sum1 -= stack1[head1++];
            } else if(sum2 > sum1 && sum2 > sum3) {
                sum2 -= stack2[head2++];
            } else {
                sum3 -= stack3[head3++];
            }
        }
    }

   public static void main(String[] args) {
      int stack1[] = { 3, 2, 1, 1, 1 };
      int stack2[] = { 4, 3, 2 };
      int stack3[] = { 1, 1, 4, 1 };

      getMaxSum(stack1, stack2, stack3);
   } 
}
