import java.util.Scanner;
class Stack{
    static final int MAX=1000;
    protected int top;
    int a[]=new int[MAX];
    boolean isEmpty(){
        return (top<0);
    }
    Stack(){
        top=-1;
    }
    void push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack Overflow");
        }
        else{
            a[++top]=x;
        }
    }
    int pop(int x){
        return a[x];
    }
    
}
class ShopMain{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s= new Stack();
        int n,k,i;
        System.out.print("Enter the no. of users:");
        n=sc.nextInt();
        System.out.println();
        if(n<1 || n>1000){
            System.out.println("Invalid no. of users");
            return;
        }
        for(i=0;i<n;i++){
        System.out.print("Enter the credit points for user "+(i+1)+": ");
        s.push(sc.nextInt());
        System.out.println();
        }
        System.out.print("Enter the no. of users to serve:");
        k=sc.nextInt();
        System.out.println();
        if(k<1 || k>n){
            System.out.println("Invalid no. of users");
            return;
        }
        if(k==n){
            System.out.println("0 users to serve");
            return;
        }
        System.out.print("The unserved user's credit points are:");
        for(i=k;i<n;i++){
            System.out.print(" "+s.pop(i));
    }
}}