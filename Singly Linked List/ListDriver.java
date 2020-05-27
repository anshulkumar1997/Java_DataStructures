import java.util.*;
public class ListDriver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> l=new LinkedList<Integer>();
        int n=sc.nextInt();
        String f="";
        for(int i=0;i<n;i++){
            String fi=sc.next();
            f+=fi;
            l.add(Integer.valueOf(fi));
        }
        String r="";
        for(int i=l.size()-1;i>=0;i--)
        r+=l.get(i);
        if(f.equals(r))
        System.out.println(1);
        else
        System.out.println(0);
        
    }
}