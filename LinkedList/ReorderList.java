class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class ReorderList{
    private Node head = null;

    private Node createNode(int value){
        return new Node(value);
    }

    public Node insertAtHead(int value){
        Node node = createNode(value);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        return head;
    }

    private Node middleOfList(Node head){
        if(head != null){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        return null;
    }

    private Node reverseList(Node head){
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
            return prev;
        }
        return null;
    }

    public Node reorderList(Node head){
        Node list1Head = head;
        Node newListHead = head;
        Node middle = middleOfList(head);
        if(middle != null){
           Node list2Head = reverseList(middle.next);
           middle.next = null;
           Node list1Next = null;
           Node list2Next = null;
           while(list1Head != null && list2Head != null){
                list1Next = list1Head.next;
                list1Head.next = list2Head;
                list1Head = list1Next;

                list2Next = list2Head.next;
                list2Head.next = list1Head;
                list2Head = list2Next;
           }
           return newListHead;
        }
        return newListHead;
    }

    public void print(Node head){
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


    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        Node head = null;
        head = reorderList.insertAtHead(10);
        head = reorderList.insertAtHead(20);
        head = reorderList.insertAtHead(30);
        head = reorderList.insertAtHead(40);
        head = reorderList.insertAtHead(50);
        reorderList.print(head);
        head = reorderList.reorderList(head);
        reorderList.print(head);
    }
}
