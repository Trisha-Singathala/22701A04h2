

class Main {
    public static void main(String[] args) {
       printrange(1,10);
    }

public static void printrange(int start,int end){
    if(start>end){
        return;
    }
    System.out.print(start+" ");
    printrange(start+1,end);
}
}