class Strong{
public static void main(String []args)
  {
    int n=145,sum=0;
    int var=n;
    while(var!=0)
      {
        int r=var%10;
        int f=1;
        while(r>1)
          {
            f=f*r;
            r--;
          }
       sum+=f;
        var/=10;
}
if(n==sum){
 System.out.println("String Number");
        }
else{
System.out.println("Not Strong Number");
      }
  }
}
