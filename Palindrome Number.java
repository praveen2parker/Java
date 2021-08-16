import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,s=0,t=n;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if(t==s){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
