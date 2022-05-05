import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {  //left rotation of an array
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Input Array:");
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number how many times you want to rotate the array");
        
        int number = sc.nextInt();
        
        for(int j=0; j<number; j++){
            
            int first= arr[0];
            for(int k=0; k < arr.length-1; k++){
                arr[k] = arr[k+1];
                
            }
            arr[arr.length-1] = first;
            }
            
            System.out.println("Output Array:");
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
            
        
        
    }
}
