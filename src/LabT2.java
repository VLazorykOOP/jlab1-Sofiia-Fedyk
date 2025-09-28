
import java.util.Scanner; 
 
public class LabT2 { 
 static Scanner in; 
 static int [] Input() 
 { 
  System.out.println("Size of the array(n<=400)"); 
  int n=in.nextInt(); 
  int[] a;

  if (n>400 || n<=0) 
   { 
   System.out.println("Error! Input n again"); 
   System.exit(0); 
   }
   
  a=new int[n]; 
  for (int i = 0; i < n; ++i) 
   { 
   System.out.print("a["+i+"]= "); 
   a[i]=in.nextInt(); 
   } 
  
  return a; 
 } 

 static void Print(int[] a) 
 { 
  for (int i = 0; i < a.length; ++i)  
   System.out.print(a[i]+" "); 
  System.out.println(); 
 } 
 
 static void Change(int[] a) 
 { 
  int n = a.length;

  for (int i = 0; i < n; i++) {

      if (a[i] >= 0) {
 
          for (int j = i + 1; j < n; j++) {
      if (a[j] < 0) {
        int temp = a[j];
        for (int k = j; k > i; k--) {
        a[k] = a[k-1];
        }
      a[i] = temp;
      break;
              }       
          }
      }
  }
 } 
 
 public static void main(String[] args) { 
  in = new Scanner(System.in); 
  int[] myArray=Input(); 
  System.out.println("Array:"); 
  Print(myArray); 
  Change(myArray); 
  System.out.println("Changed array:"); 
  Print(myArray); 
 } 

} 