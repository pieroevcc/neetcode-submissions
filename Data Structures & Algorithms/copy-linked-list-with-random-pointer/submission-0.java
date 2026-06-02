/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null){  
            map.put(cur , new Node(cur.val)); 
            cur = cur.next;
        }
        Node curr = head;
        while (curr != null){
            Node cnt = map.get(curr);
            cnt.next = map.get(curr.next);
            cnt.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
        
    }
}
