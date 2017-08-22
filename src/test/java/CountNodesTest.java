import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 */
public class CountNodesTest {

    @Test
    public void testCountNodesPositive() {

        int expectedCount = 0;
        Node root = null;
        System.out.println(new NodeCounter().countNodes(root));
    }

    @Test
    public void testCountNodesPositive2() {

        int expectedCount = 1;
        Node root = new Node();
        System.out.println(new NodeCounter().countNodes(root));
    }

    @Test
    public void testCountNodesPositive3() {

        int expectedCount = 3;
        Node node = new Node();
        List<Node> nodes = Arrays.asList(node, node);
        Node root = new Node(nodes);

        System.out.println(new NodeCounter().countNodes(root));
    }

    @Test
    public void testCountNodesPositive4() {

        int expectedCount = 4;
        Node node = new Node();
        List<Node> nodes = Arrays.asList(node, node);
        Node root = new Node(nodes);
        root.nodes.stream().map(i -> i.nodes = Arrays.asList(node, node)).collect(Collectors.toList());

        System.out.println(new NodeCounter().countNodes(root));
    }
}
