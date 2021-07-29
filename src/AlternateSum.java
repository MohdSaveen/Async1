import java.util.Scanner;

public class AlternateSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();
        System.out.println("Enter the array numbers");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }int sum=0;
        for(int i=0;i<size;i=i+2){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
