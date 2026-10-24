// BinarySearchTree.java
public class BinarySearchTree<T extends Comparable<T>> {
    protected  Node<T> raiz;

    private Node<T> add(Node<T> raiz, Node<T> novoNo) {
        if (raiz == null) {
            raiz = novoNo;
            return raiz;
        } else if (novoNo.dado.compareTo(raiz.dado) < 0)
            raiz.esquerda = add(raiz.esquerda, novoNo);
        else
            raiz.direita = add(raiz.direita, novoNo);

        return raiz;
    }// fim funcao inserir

    public void add(T dado) {
        Node<T> node = new Node<>(dado);
        this.raiz = add(raiz, node);
    }

    private void preOrder(Node<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.dado + " ");
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }
    }

    public void preOrder() {
        preOrder(this.raiz);
        System.out.println();
    }

    private void inOrder(Node<T> raiz) {
        if (raiz != null) {
            inOrder(raiz.esquerda);
            System.out.print(raiz.dado + " ");
            inOrder(raiz.direita);
        }
    }

    public void inOrder() {
        inOrder(this.raiz);
        System.out.println();
    }

    private void posOrder(Node<T> raiz) {
        if (raiz != null) {
            posOrder(raiz.esquerda);
            posOrder(raiz.direita);
            System.out.print(raiz.dado + " ");
        }
    }

    public void posOrder() {
        posOrder(this.raiz);
        System.out.println();
    }

    public T buscar(T dadoBusca) {
        return (T) buscar(this.raiz, dadoBusca);
    }

    int cont=0;
    private T buscar(Node<T> raiz, T dadoBusca) {
        cont++;
        if (raiz == null){
            System.out.println("Quantidade de comparações: "+cont);
            return null; // Dado não encontrado na árvore
        }
        if (raiz.dado.equals(dadoBusca)){
            System.out.println("Quantidade de comparações: "+cont);
            return raiz.dado; // Dado encontrado
        }
        if (dadoBusca.compareTo(raiz.dado) < 0)
            return buscar(raiz.esquerda, dadoBusca);
        else
            return buscar(raiz.direita, dadoBusca);
    }


}