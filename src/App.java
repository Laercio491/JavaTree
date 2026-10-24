
import java.util.Scanner;

public class App {

    static int menu(Scanner leia) {
        System.out.println("\nÁrvore Binária de Busca");
        System.out.println("1. Inserir aluno");
        System.out.println("2. Remover aluno");
        System.out.println("3. Buscar aluno");
        System.out.println("4. Exibir árvore");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        return leia.nextInt();
    }

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        BinarySearchTree<Aluno> arvore = new BinarySearchTree<>();

        int opcao;

        do {
            System.out.println("----------------------------------");
            opcao = menu(leia);

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matrícula do aluno: ");
                    int matriculaInserir = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nome = leia.nextLine();

                    Aluno aluno = new Aluno(nome, matriculaInserir);
                    arvore.add(aluno);

                    System.out.println("Aluno inserido com sucesso!");
                    break;

                case 2:
                    
                    break;

                case 3:
                    System.out.print("Digite a matrícula do aluno a ser buscado: ");
                    int matriculaBuscar = leia.nextInt();

                    Aluno alunoBuscar = new Aluno("", matriculaBuscar);
                    Aluno resultado = arvore.buscar(alunoBuscar);

                    if (resultado != null) {
                        System.out.println("Aluno encontrado: " + resultado);
                    } else {
                        System.out.println("Aluno não encontrado na árvore!");
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a árvore em pré-ordem:");
                    arvore.preOrder();

                    System.out.println("Exibindo a árvore em ordem:");
                    arvore.inOrder();

                    System.out.println("Exibindo a árvore em pós-ordem:");
                    arvore.posOrder();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        leia.close();
    }
}