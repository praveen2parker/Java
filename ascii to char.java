class HelloWorld {
    public static int calc(int n){
        int sum=0,temp;
        while(n>0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
       return sum; 
    }
    public static void main(String[] args) {
        int n=558823,as,sum;
        sum=calc(n);
        if(sum>26){
            sum=calc(sum);
        }
        as=64+sum;  
        char c=(char)as;
        System.out.println(c);
    }
}
