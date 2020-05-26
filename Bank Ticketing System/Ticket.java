import java.util.Scanner;
class QNode{
    int data;
    QNode next;
    QNode(int data){
        this.data=data;
        next=null;
    }
}
class queue{
    public QNode front,rear;
    public queue(){
        front=null;
        rear=null;
    }
    boolean isEmpty(){
        if(this.front==null)
        return true;
        return false;
    }
    public void enqueue(QNode n){
        if(isEmpty()){
            this.front=n;
            this.rear=n;
        }
        else{
            this.rear.next=n;
            this.rear=n;
        }
    }
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue Overflow");
            return -1;
        }
        else{
            int x=this.front.data;
            this.front=this.front.next;
            return x;
            
        }
    }
    public void traverse(){
        QNode t=this.front;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
class Ticket{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,k;
        queue q=new queue();
        System.out.println("Enter the number of customer takes the tickets:");
        n=sc.nextInt();
        if(n<1){
            System.out.println("Invalid Number");
            return;
        }
        for(i=1;i<=n;i++)
        {QNode x=new QNode(i);
        q.enqueue(x);}
        System.out.println("The tickets in the system are:");
        q.traverse();
        System.out.println();
        System.out.println("Enter the number of tickets served:");
        k=sc.nextInt();
        if(k>n || k<1){
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("The served tickets are:");
        for(i=1;i<=k;i++){
            System.out.print(q.dequeue()+" ");
        }
        System.out.println();
        if(k==n){
            System.out.println("No more tickets to be served");
            return;
        }
        else{
            System.out.println("The unserved tickets are:");
            for(i=k+1;i<=n;i++)
            System.out.print(q.dequeue()+" ");
    }}
}