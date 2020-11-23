/*--------------

Sum

--------------*/
public static int findSum(int[] array) {
       int sum = 0;
       for (int value : array) {
             sum += value;
       }
    return sum;
}
/*--------------

Average

--------------*/
public static double findAverage(int[] array) {
    int sum = findSum(array);
    return (double) sum / array.length;
}

/*--------------

Minimum

--------------*/
public int min(int [] array) {
      int min = array[0];
   
      for(int i = 0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }
/*--------------

Maximum

--------------*/
public int max(int [] array) {
      int max = 0;

      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
/*--------------

Printing Element Seperators.

--------------*/

for (int a = 0; a < array.length; a++){
array[a] = a + 1;
System.out.print(array[a] + ", ");
}

/*--------------

Array from -99 to 99

--------------*/
int max = 99;
int min = -99;
Random rand = new Random();
int randomNum = rand.nextInt((max - min) + 1) + min;

/*--------------

Removing an Element

--------------*/
import java.util.Arrays;

class Test {
    public static void main(String[] args){

          System.out.println("\n");

          int[] array = { 10, 20, 30, 40, 50 };
          System.out.println("Original Array: " + Arrays.toString(array));

          int index = 2;
          System.out.println("Index Used to Remove Element : " + index);

          int[] newArr = new int[array.length - 1];
          for(int j=0, k=0; j<array.length; j++) {
          if(j == index)
          continue;

       newArr[k++] = array[j];
     }


     System.out.println("After removing an element, new Array : ");
     for (int l=0; l<newArr.length; l++) {
         System.out.print(newArr[l] + " ");
     }
     System.out.println("\n");
  }
}

/*--------------

Inserting an Element.

--------------*/
import java.util.Arrays;

class insertAnElement {
     public static void main(String[] args) {

     int[] array = {1, 5, 10, 15, 20, 25};

     int Index_position = 2;
     int newValue = 5;

     System.out.println("Original Array : " + Arrays.toString(array));

     for(int i=array.length-1; i > Index_position; i--){
     array[i] = array[i-1];
    }
   array[Index_position] = newValue;
   System.out.println(" New Array : " + Arrays.toString(array));
 }
}

/*--------------

Swapping Two Elements

--------------*/

import java.util.*;

public class swapTwoElement {
     public static void main(String[] args){

     ArrayList<String> list = new ArrayList<String>();
     list.add("1");
     list.add("2");
     list.add("3");
     list.add("4");

     System.out.println(" Old List : \n " + list);

     Collections.swap(list, 1, 2);

     System.out.println(" New List : \n " + list);
   }
}

/*--------------

Copying the Entire Array.

--------------*/


public class copyEntireArray {
    public static void main(String[] args){

    int a[] = {1, 8, 3};
    int b[] = new int[a.length];

    b = a;

    b[0]++;

    System.out.println("Contents of a[]");
    for (int i=0; i<a.length;i++)
        System.out.print(a[i] + "");

    System.out.println("\n\n Contents of b[]");
    for (int i=0; i<b.length; i++)
        System.out.print(b[i] + "");
    }
}
