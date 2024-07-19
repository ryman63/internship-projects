public class Node<T>
{
    Node<T> prev = null; // указатель на пред. ноду
    Node<T> next = null; // указатель на след. ноду

    public Node(T value) {

        this.value = value;
    }

    private T value; // значение ноды

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
