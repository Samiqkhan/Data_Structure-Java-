import java.util.*;
class Main{
    static class Node{
        int data;
        Node nxt;
    }
    public static void insert(Node head){
        Node obj = new Node();
        Scanner sc = new Scanner(System.in);
        obj.data =sc.nextInt();
        Node t = head;
        while (t.nxt!=null)
        {
            t=t.nxt;
        }
        t.nxt=obj;
    }
    public static void display(Node head){+
    
        Node p = head.nxt;
        while(p!=null){
            System.out.println(p.data);
            p=p.nxt.nxt;
        }
    }
    public static void main(String [] args){
        Node head = new Node();
        head.nxt= null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=0;i<n;i++){
            insert(head);
        }
        display(head);
    }
}
