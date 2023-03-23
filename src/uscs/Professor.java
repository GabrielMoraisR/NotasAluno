package uscs;

public class Professor {

    private int cod_professor;
    private String nome_prof;
    private String email_prof;
    private String fone_prof;

    public Professor(int cod_professor,
            String nome_prof,
            String email_prof,
            String fone_prof) {
        this.cod_professor = cod_professor;
        this.nome_prof = nome_prof;
        this.email_prof = email_prof;
        this.fone_prof = fone_prof;
    }

    public Professor() {
    }

    public void ImprimeProfessor() {
        System.out.println("Código do professor: " + cod_professor);
        System.out.println("Nome do professor: " + nome_prof);
        System.out.println("Email do professor: " + email_prof);
        System.out.println("Fone do professor: " + fone_prof);
    }
}
