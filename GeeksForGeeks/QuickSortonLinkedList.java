package GeeksForGeeks;

public class QuickSortonLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    Node head;

    void addNode(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode = new Node(data);
        temp.next=newNode;
    }

    void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    Node partition(Node start,Node end){
        if(start==null||start==end||start==end.next){
            return start;
        }
        Node prev_pivot=start;
        Node curr=start;
        int pivot=end.data;
        while(start!=end){
            if(start.data<pivot){
                prev_pivot=curr;
                int temp=curr.data;
                curr.data=start.data;
                start.data=temp;
                curr=curr.next;
            }
            start=start.next;
        }
        int temp=curr.data;
        curr.data=pivot;
        end.data=temp;

        return prev_pivot;        
    }


    public void quicksort(Node start, Node end){
        if(start==null||start==end||start==end.next){
            return;
        }
        /* Node prev=partition(start,end);
        quicksort(start,prev);
    
        if(prev!=null && prev==start){
            quicksort(prev.next, end);
        }else if(prev!=null && prev.next!=null){
            quicksort(prev.next.next, end);
        } */

        Node pivot = partition(start, end);
        quicksort(start, pivot);
        quicksort(pivot.next, end);
    }
    public static void main(String[] args) {
        QuickSortonLinkedList list = new QuickSortonLinkedList();
        list.addNode(4);
        list.addNode(6);
        list.addNode(2);
        list.addNode(0);
        list.addNode(24);
        list.addNode(21);

        Node n = list.head;
        while(n.next!=null){
            n=n.next;
        }
        System.out.print("Linked List before sorting: ");
        list.printList(list.head);

        list.quicksort(list.head,n);
        System.out.print("After Sorting: ");
        list.printList(list.head);
    }
}
