import java.util.Scanner;
class stack{
    int top,size,s[];
    stack(int n){
        size=n;
        top=-1;
        s=new int[size];
    }
    void push(int x){
        if(top>=size-1){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            s[++top]=x;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int x=s[top--];
            return x;
        }
    }
    int findMiddle(){
        int x;
        if(size%2==0)
        x=size/2-1;
        else
         x=Math.round(size/2);
        return s[x];
    }
}
class StackDriver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be pushed in the stack:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        
        stack s=new stack(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter the element "+i+":");
            s.push(sc.nextInt());
        }
        System.out.println("The middle element is: "+s.findMiddle());
        System.out.println("The popped element is: "+s.pop());
    }
}