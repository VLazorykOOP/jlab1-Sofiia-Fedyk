import java.util.Scanner; 
public class LabT1{ 
 
 public static void main(String[] args) { 
    Scanner in= new Scanner(System.in); 
    int var=-1;

    while ( var!=0){
    System.out.print("Input number(1-3):\n 1-float/float\n 2-int/float\n 3-float/int\n 0-exit\nChoose:\n ");
    var = in.nextInt();
    
    switch (var) {
        case 1:
        System.out.print("Input a:"); 
        float a1= in.nextFloat();
      
        System.out.print("Input b:"); 
        float b1 = in.nextFloat();
      
        if (b1!=1){ 
          double c1 = (a1/(Math.pow(b1,2)-2))+(b1/(Math.pow(a1,2)+2))+(Math.pow(a1*b1,2));
         System.out.printf("c = %.2f%n", c1); 
        }
        else {
         System.out.println("Error! b must not be 1");
        }
            break;
        case 2:
        System.out.print("Input a:"); 
        int a2 = in.nextInt();
      
        System.out.print("Input b:"); 
        int b2 = in.nextInt();
      
        if (b2!=1){ 
          double c2 = (a2/(Math.pow(b2,2)-2))+(b2/(Math.pow(a2,2)+2))+(Math.pow(a2*b2,2));
         System.out.printf("c = %.2f%n", c2); 
        }
        else {
         System.out.println("Error! b must not be 1");
        }
            break;

        case 3:
        System.out.print("Input a:"); 
        float a3 = in.nextFloat();
      
        System.out.print("Input b:"); 
        float b3 = in.nextFloat();
      
        if (b3!=1){ 
          double c3 = (a3/(Math.pow(b3,2)-2))+(b3/(Math.pow(a3,2)+2))+(Math.pow(a3*b3,2));
         System.out.printf("c = %d%n", (int)c3); 
        }
        else {
         System.out.println("Error! b must not be 1");
        }
            break;

            case 0:
            break;

        default:
            System.out.println("Error! Input number from 1 to 3, if you want to exit input q");
            
    }
    System.out.println();   
}
    in.close();
}
}
