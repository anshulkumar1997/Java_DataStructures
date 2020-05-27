import java.util.Scanner;
class queue{
    int front,rear,max,q[];
    queue(int m){
        front=rear=0;
        max=m;
        q=new int[max];
    }
    void enqueue(int x){
        if(rear==max){
            System.out.println("Queue Overflow");
            return;
        }
        else{
            q[rear++]=x;
        }
        return;
    }
    int dequeue(){
        if(front==rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int x=q[front];
            front++;
            return x;
        }
    }
    void display(){
        for (int i=front;i<rear ;i++ ){
            System.out.print(q[i]+" ");
            if(i==max)
            i=0;
        } 
    }
    void sort(){
        int i,j=front,k=rear;
        for(i=j;i<k;i++)
        if(q[i]%2!=0)
        dequeue();
    }
}
class Chocolate{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of boxes: ");
        int m=sc.nextInt();
        int i,k;
        System.out.println();
        if(m<=0 || m>10){
            System.out.println("Invalid input");
            return;
        }
        queue q=new queue(m);
        for (i=1;i<=m ;i++ ){
            System.out.print("Enter the no. of chocolates in box "+i+": ");
            k=sc.nextInt();
            if(i==1)
            if(k<=0 || k%2!=0){
                System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
                return;
            }
            q.enqueue(k);
            System.out.println();
        }
        q.sort();
        System.out.print("No.of chocolates in each box: ");
        q.display();
    }
}