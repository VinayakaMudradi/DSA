class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class LinkedList{
    private Node head = null;

    private Node createNode(int value){
        return new Node(value);
    }

    public void insertAtHead(int value){
        Node node = createNode(value);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public void insertAtTail(int value){
        Node node = createNode(value);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtIndex(int value, int K){
        Node node = createNode(value);
        Node next = head;
        Node prev = null;
        boolean isIndexOutOfBound = false;
        if(K == 1){
            insertAtHead(value);
        }
        else{
            K--;
            // for loop can also be used here.
            while(K != 0){
                if(next == null){
                    isIndexOutOfBound = true;
                    break;
                }
                K--;
                prev = next;
                next = next.next;
            }
            if(isIndexOutOfBound){
                System.out.println("Index out of bound");
            }
            else{
                node.next = next;
                prev.next = node;
            }
        }
        
    }

    public void deleteAtHead(){
        if(head != null){
            System.out.println("\nDeleted element is "+ head.value);
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head != null){
            Node next = head;
            Node prev = head;
            while(next.next != null){
                prev = next;
                next = next.next;
            }
            System.out.println("\nDeleted element is "+ next.value);
            prev.next = null;
        }
    }

    public void reverse(){
        if(head != null){
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }

    public void print(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        else{
            System.out.println("LinkedList is empty.");
        }
    }


    // Sorted list
    public void removeDuplicates(){
        if(head != null){
            Node prev = null;
            Node current = head;
            while(current.next != null){
                prev = current;
                current = current.next;
                if(prev.value == current.value){
                    prev.next = current.next;
                    current = prev;
                }
            }
        }
    }

    public void middleOfList(){
        if(head != null){
            if(head.next == null){
                System.out.println("Middle of list is "+head.value);
            }
            else{
                Node slow = head;
                Node fast = head;
                while (fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                System.out.println("Middle of list is "+slow.value);
            }
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // linkedList.print();
        // linkedList.insertAtHead(10);
        // linkedList.insertAtHead(20);
        // linkedList.insertAtTail(40);
        // linkedList.insertAtIndex(90, 1);
        // linkedList.print();
        // linkedList.deleteAtHead();
        // linkedList.print();
        // linkedList.deleteLast();
        // linkedList.print();
        // linkedList.reverse();
        // linkedList.print();
        linkedList.insertAtTail(10);
        linkedList.insertAtTail(20);
        linkedList.insertAtTail(30);
        linkedList.insertAtTail(40);
        linkedList.insertAtTail(50);
        // linkedList.print();
        // linkedList.removeDuplicates();
        linkedList.middleOfList();
        linkedList.print();
    }
}
