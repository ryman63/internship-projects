public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.push(1);

        linkedList.push(2);

        linkedList.push(3);

        System.out.println(linkedList.getHeadNode().getValue());

        linkedList.pop();

        System.out.println(linkedList.getTailNode().getValue());

        linkedList.shift();

        System.out.println(linkedList.getHeadNode().getValue());
    }
}
