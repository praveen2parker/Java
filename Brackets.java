import java.util.Scanner;
public class Main
{
    public static String Brackets(String str){
        int open=0,close=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
        }
            if(open>close){
                str=Integer.toString(open-close);
            }else{
                str=Integer.toString(close-open);
            }
            
        return str;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brackets");
		System.out.println(Brackets(sc.nextLine()));
	}
}
