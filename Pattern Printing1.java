import java.util.Scanner;
public class PatterPrinting{
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Row");
        row=sc.nextInt();
        for(int i=0;i<=row-1;i++){
            for(int j=2*(row-i);j>=0;j--){
                System.out.print(" ");
            }
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                 }
            System.out.println();
        }
    }
}
