public class GroveTester {
    public static void main(String[] args) {
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);

        for (int i = 0; i < 7; i++) {
            Tree tree = new Tree(i, 37, "Spruce");
            grove1.plantTree(tree);
        }
        System.out.println(grove1);

        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1);

        Tree mapleTree = new Tree(1, 13, "Maple");
        grove1.plantTree(mapleTree);
        System.out.println(grove1);
    }
}
