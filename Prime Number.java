import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int flag=0;
        if(num==0||num==1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }
}
