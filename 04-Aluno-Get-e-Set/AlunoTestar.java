public class AlunoTestar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        // Aluno.aluno = "nome";
        aluno1.setNome("Allison");

        System.out.println(aluno1.getNome());
        aluno1.setIdade(15);
    }
}
