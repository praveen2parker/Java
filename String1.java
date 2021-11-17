//Finding non repeating second given string 
public class MyClass {
    public static void main(String args[]) {
      String s= "abaacbadaeefgg";
      int count,temp=0;
      for(int i=0;i<s.length();i++){
          count =0;
          for(int j=0;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)){
                  count++;
              }
          }
          if(count==1){
              temp++;
              if(temp==2){
               System.out.print(s.charAt(i));   
              }
          }
      }
        if(temp==0||temp==1){
               System.out.print("not a repeating ");
          }
    }
}
