

class Main {
    public static void main(String[] args) {
       int[] a={2,9,18,21,22};
       int[] b={1,3,6,19,27,30};
       int[] c=new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               c[k]=a[i];
               k++;
               i++;
           } else{
               c[k]=b[j];
               k++;
               j++;
           }
       } 
       while(i<a.length){
           c[k]=a[i];
           k++;
           i++;
       }
       while(j<b.length){
           c[k]=b[j];
           k++;
           j++;
       }
       System.out.println("The elements after merging the two sorted array are:");
       for(int x=0;x<c.length;x++){
           System.out.print(c[x]+" ");
       }
}
}