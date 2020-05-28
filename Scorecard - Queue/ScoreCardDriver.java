import java.util.Scanner;
class queue{
    int front,rear,q[],size;
    queue(int n){
        size=n;
        front=rear=0;
        q=new int[size];
}
void enqueue(int x){
    if(rear==size){
        System.out.println("Queue Oberflow");
        return;
    }
    else
    q[rear++]=x;
}
void dequeue(){
    if(front==rear){
        System.out.println("Queue is empty");
        return;
    }
    else
    front++;
}
void display(){
    for (int i=front;i<rear ;i++ ){
        System.out.print(" "+q[i]);
        if(i==size)
        i=0;
    } 
}
}
class ScoreCardDriver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the score card:");
        int n=sc.nextInt();
        int i,k;
        if(n<=0 || n>100){
            System.out.println("Invalid score card size");
            return;
        }
        queue q= new queue(n);
        for(i=1;i<=n;i++){
            System.out.print("Enter the hurdle race score "+i+":");
            q.enqueue(sc.nextInt());
        }
        if(n>5){
        k=n-5;
        for(i=1;i<=k;i++)
        q.dequeue();
    }
    System.out.print("Latest hurdle race scores are:");
    q.display();
    
}}