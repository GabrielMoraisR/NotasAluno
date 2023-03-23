package uscs;

public class Curso {

    private int cod_curso;
    private String desc_curso;
    private int duracao_semestre;

    public Curso(int cod_curso, String desc_curso, int duracao_semestre) {
        this.cod_curso = cod_curso;
        this.desc_curso = desc_curso;
        this.duracao_semestre = duracao_semestre;
    }

    public Curso() {
    }

    public void ImprimeCurso() {
        System.out.println("Código do curso: " + cod_curso);
        System.out.println("Descrição do curso: " + desc_curso);
        System.out.println("Duração em semestres: " + duracao_semestre);
    }

}
