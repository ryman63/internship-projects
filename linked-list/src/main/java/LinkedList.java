public class LinkedList<T>
{
    private Node<T> headNode = null;
    private Node<T> tailNode = null;
    public LinkedList()
    {

    }

    public Node<T> getHeadNode() {
        if(headNode != null)
            return headNode;
        return null;
    }

    public Node<T> getTailNode() {
        if(tailNode != null)
            return tailNode;
        return null;
    }

    public void push(T value)
    {
        Node<T> ptr = new Node<T>(value);

        ptr.prev = tailNode;
        if (tailNode != null)
            tailNode.next = ptr;
        if (headNode == null)
            headNode = ptr;
        tailNode = ptr;
    }

    public void unshift(T value)
    {
        Node<T> ptr = new Node<T>(value);

        ptr.next = headNode;
        if(headNode != null)
            headNode.prev = ptr;
        if(tailNode == null)
            tailNode = ptr;
        headNode = ptr;
    }

    public T pop()
    {
        if(tailNode == null)
            return null;

        T value = tailNode.getValue();
        Node<T> ptr = tailNode.prev;
        ptr.next = null;
        tailNode = ptr;

        return value;
    }

    public T shift()
    {
        if(headNode == null)
            return null;

        T value = headNode.getValue();
        Node<T> ptr = headNode.next;
        ptr.prev = null;
        headNode = ptr;

        return value;
    }
}
