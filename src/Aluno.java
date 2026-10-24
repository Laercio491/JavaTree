
public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.matricula, outro.matricula);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aluno outro = (Aluno) obj;
        return this.matricula == outro.matricula;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "[Matrícula: " + matricula + " - Nome: " + nome + "]";
    }
}
