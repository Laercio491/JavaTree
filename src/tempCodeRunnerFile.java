System.out.print("Digite o matricula a ser removido: ");
                    Integer elementoRemover = leia.nextInt();
                    Aluno alunoRemover =new Aluno(nome="", elementoRemover);// remover elemento da árvore
                    arvore.remove(alunoRemover);