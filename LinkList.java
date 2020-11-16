class Node {
    private int number;
    private int square;
    private int membersize;
    private int sex;
    private int whetherhavetoilet;
   public Node next;
   public Node(int a,int b,int c,int d,int e){
       this.number=a;
       this.square=b;
       this.membersize=c;
       this.sex=d;
       this.whetherhavetoilet=e;
       this.next=null;
   }
   public Object get(String a){

       if(a.equals("number"))return number;
       if(a.equals("square"))return square;
       if(a.equals("membersize"))return membersize;
       if(a.equals("sex"))return sex;
       if(a.equals("whetherhavetoilet"))return whetherhavetoilet;
        return 0;
        }
public void set(String a,Object b){
        if(a.equals("number"))number=(int)b;
        if(a.equals("square"))square=(int)b;
        if(a.equals("membersize"))membersize=(int)b;
        if(a.equals("sex"))sex = (int)b;
        if(a.equals("whetherhavetoilet"))whetherhavetoilet=(int)b;
        }
        }

public class LinkList {
    private Node Head = new Node(0, 0, 0, 0, 0);
    public int length = 0;
    public Node getfirst(){
        return Head;
    }
    public int insert(Node a, int b) {
        if (b < 0 || b > length + 1) return 0;
        Node temp =Head;
        for (int i = 0; i < b - 1; i++) {
            temp = temp.next;
        }
        a.next = temp.next;
        temp.next = a;
        length++;
        return 1;
    }

    public int delete(int a){
        if (a < 0 || a > length) return 0;
        Node temp = Head;
        for (int i = 0; i < a - 1; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        length--;
        return 1;
    }
    public  Node getlast(){
        Node P=Head;
        while(P.next!=null){
            P=P.next;
        }
        return P;
    }

    public static int hebing(LinkList a,LinkList b){
        Node pa =a.Head.next;
        Node prea,preb;
        Node pb =b.Head.next;
        a.length=a.length+b.length;
        a.Head.next=null;
        while(pa!=null&&pb!=null){
            if((int)pa.get("number")>(int)pb.get("number")){
                preb=pb;
                pb=pb.next;
                preb.next=a.getlast().next;
                a.getlast().next=preb;
            }
            else{
                prea=pa;
                pa=pa.next;
                prea.next=a.getlast().next;
                a.getlast().next=prea;
            }
        }
       if(pa!=null) a.getlast().next=pa;
       if(pb!=null) a.getlast().next=pb;
        b.Head.next=null;
        return 0;

    }





}