import java.util.ArrayList;

public class Grove {
    private ArrayList<Tree> trees;
    private String groveName;

    public Grove(String groveName) {
        this.groveName = groveName;
        trees = new ArrayList<>(12);
    }

    public int plantTree(Tree tree) {
        if (trees.size() < 12) {
            trees.add(tree);
            return trees.size() - 1;
        }
        return -1; // no available spot
    }

    public Tree removeTree(int index) {
        if (index >= 0 && index < trees.size()) {
            return trees.remove(index);
        }
        return null; // invalid index
    }

    @Override
    public String toString() {
        return trees.size() + " trees planted in " + groveName;
    }
}
