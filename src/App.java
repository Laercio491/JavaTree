public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> arvore = new BinarySearchTree<>();

        arvore.add(50);
        arvore.add(30);
        arvore.add(70);
        arvore.add(20);
        arvore.add(40);
        arvore.add(60);
        arvore.add(80);

        System.out.println("Percurso em Pre-Ordem:");
        arvore.preOrder();
    }
}