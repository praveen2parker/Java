import java.util.Scanner;
public class Main
{
    public static String numberEncoding(String str){
        String encoderStr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(c>='a'||c<='z'){
                
                encoderStr+=c-96;
            }
            else{
                encoderStr+=c;
            }
        }
        return encoderStr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		System.out.println(numberEncoding(sc.nextLine()));
		//Input: "hello 45"
		//Output: 85121215 45
		//This is the out put what i got 85121215-64-44-43
	}
}
