import java.util.Scanner;
public class Main
{
    public static String permuntation(String str){
        String empty="";
        int s=3;
        for(int i=0;i<str.length();i++){
            if(i==str.length()-s){
                if(1<s){
                     empty+=str.charAt(i+1);
                    
                }else{
                    empty+=str.charAt(i-2);
                }
               
                s--;
            }else{
                empty+=str.charAt(i);
            }
        }
        return empty;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
	    System.out.println(permuntation(sc.nextLine()));
	    //input=11121(or)41352
	    //output=11211(or)41523
	}
}
