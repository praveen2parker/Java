public class Main
{
	public static void main(String[] args) {
		String para="hello everyone na madan gowri";
		String w1="everyone",w2="gowri";
		int s1=0,s2=0;
		String arr[]=para.split(" ");
		for(int i=0;i<arr.length;i++){
		    
		    if(w1.equals(arr[i])){
		        s1=i;
		       
		    }
		    if(w2.equals(arr[i])){
		        s2=i;
		      
		    }
		}
	
		System.out.println(s2-s1-1);
	}
}
