public class LinkedList {
    Node head;

    public int get(int index) {
        Node currNode = head;
        int count = 0;

        while (currNode != null) {
            if (count == index) {
                return currNode.val;
            }
            currNode = currNode.next;
            count++;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        head = newNode;
        newNode.next = temp;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        Node check = head;
        while (check != null) {
            if (check.next == null) {
                check.next = newNode;
                return;
            }
            check = check.next;
        }
        head = newNode;
    }

    public boolean remove(int index) {
        int count = 0;
        Node currNode = head;
        Node prevNode = null;

        while (currNode != null) {
            if (count == index && prevNode == null) {
               head = currNode.next;
              return true;
            }else if(count == index && prevNode != null){
                prevNode.next =   currNode.next;
              return true;
            }else{
            prevNode = currNode;
            currNode = currNode.next;
            }
            count++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> vals = new ArrayList();
        Node currNode = head;
        while(currNode != null){
           vals.add(currNode.val);
           currNode = currNode.next;
        }
        return vals;
    }
}
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}


