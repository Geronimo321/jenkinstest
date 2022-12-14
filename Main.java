public class Main {
    public static void main(String[] args) {
        int count = 100;
        System.out.print(0 +" "+ 1);
        printFib(count-1);
    }
    static float n1=0;
    static float n2=1;
    static float n3=0;
    static void printFib(int n){
        if(n >0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFib(n-1);
        }
    }

}
