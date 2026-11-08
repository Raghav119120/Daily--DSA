//lc 1472 t.c ->O(1)+O(1)+O(2*steps) s.c ->O(1)
class Node{
    String val;
    Node next;
    Node back;
    public Node(String val){
        this.val = val;
        this.next = null;
        this.back = null;
    }
}
class BrowserHistory {
    private Node current;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.back = current;
        current = newNode;
    }
    
    public String back(int steps) {
        while(steps>0 && current.back!=null){
            
            current = current.back;
            
            steps--;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while(steps>0 && current.next!=null){
           
            current  = current.next;
        
            steps--;
        }
        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
