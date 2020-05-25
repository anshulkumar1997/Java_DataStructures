import java.util.Scanner;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    public void append(int data){
        Node n=new Node(data);
        Node c=head;
        if(head==null){
            head=n;
            return;
        }
        else{
            while(c.next!=null)
            {c=c.next;}
            c.next=n;
            return;
        }}
    public void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public void reverse(){
        Node pn=null,nn,cn=head;
        while(cn!=null){
            nn=cn.next;
            cn.next=pn;
            pn=cn;
            cn=nn;
        }
        head=pn;
    }
    
}
public class List{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();
        String c;
        do{
            System.out.println("Enter the value:");
            int v=sc.nextInt();
            l.append(v);
            System.out.println("Do you want to add another node? Type Yes/No");
            c=sc.next();
        }while(c.equalsIgnoreCase("yes"));
        System.out.print("The elements in the linked list are: ");
        l.display();
        System.out.println();
        l.reverse();
        System.out.print("The elements in the reversed linked list are : ");
        l.display();
    }
}