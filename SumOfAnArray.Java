import java.util.Scanner;
class Sum
  {
   public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<10; i++)
        {
         array[i] = sc.nextInt();
        }
        for( int num=0; num<10; num++)
          {
           sum = sum+array[num];
          }
          System.out.println("Sum of the array elements is "+sum);
     }
  }
