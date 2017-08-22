import java.util.ArrayList;
import java.util.List;

/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 */
public class Node {

    public Object value;
    public List<Node> nodes = new ArrayList<>();

    public Node() {
    }

    public Node(List<Node> nodes) {
        this.nodes = nodes;
    }

    public Node(Object value, List<Node> nodes) {
        this.value = value;
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != null ? !value.equals(node.value) : node.value != null) return false;
        return nodes != null ? nodes.equals(node.nodes) : node.nodes == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (nodes != null ? nodes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nodes=" + nodes +
                '}';
    }
}
