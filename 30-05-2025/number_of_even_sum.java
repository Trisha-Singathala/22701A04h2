

class Main {
    public static void main(String[] args) {
   int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
   int sum=0;
   int count=0;
   for(int i=0;i<num.length;i++){
       while(num[i]!=0){
           int rem=num[i]%10;
           sum=sum+rem;
           num[i]=num[i]/10;
       }
       
   
   if(sum%2==0)    count++;
  sum=0;
   }
    System.out.println(count);
 }
}
