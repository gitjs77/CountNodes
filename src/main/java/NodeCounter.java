/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 */
public class NodeCounter {

    public int countNodes(final Node root) {

        if (root == null) {
            return 0;
        }
        if (root.nodes.size() == 0) {
            return 1;
        }
        if (root.nodes.size() == 1) {
            return 2;
        }

        for (int i = 0; i < root.nodes.size(); i++) {
            countNodes(root.nodes.get(i));
        }

        return 1 + root.nodes.size();
//                + (int) root.nodes.stream().map(this::countNodes).count();


    }
}
