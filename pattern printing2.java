public class MyClass {
    public static void main(String args[]) {
        int n=6;
        String s="PYTHON";
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            int l=0;
            for(int j=i;j>1;j--){
                if(j-i==0){
                     System.out.print(s.charAt(j-j));
                }
                else{
                     System.out.print(s.charAt(j-j+ ++l));
                }
            }
            System.out.println();
        }
    }
}
