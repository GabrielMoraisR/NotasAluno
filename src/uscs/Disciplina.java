package uscs;

public class Disciplina {

    private int cod_disciplina;
    private String desc_disciplina;

    public Disciplina(int cod_disciplina, String desc_disciplina) {
        this.cod_disciplina = cod_disciplina;
        this.desc_disciplina = desc_disciplina;
    }

    public Disciplina() {

    }

    public void ImprimeDisciplina() {
        System.out.println("Código da disciplina: " + cod_disciplina);
        System.out.println("Descrição da disciplina: " + desc_disciplina);
    }
}
