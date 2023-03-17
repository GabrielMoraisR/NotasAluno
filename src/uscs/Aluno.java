package uscs;

public class Aluno {
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1;
    private double nota_P2;
    private double nota_P3;
    
    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3) {
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;
    }
    
    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + ImprimeSexo());
        System.out.println("Nota P1: " + nota_P1);
        System.out.println("Nota P2: " + nota_P2);
        System.out.println("Nota P3: " + nota_P3);
        System.out.println("Média: " + MediaAluno());
        System.out.println("Resultado: " + Resultado());
        System.out.println();
    }
    
    public String ImprimeSexo() {
        if (sexo == 'M') {
            return "Masculino (" + nome + ")";
        } else if (sexo == 'F') {
            return "Feminino (" + nome + ")";
        } else {
            return "Sexo inválido";
        }
    }
    
    public double MediaAluno() {
        double maior1 = Math.max(nota_P1, Math.max(nota_P2, nota_P3));
        double maior2 = 0;
        if (maior1 == nota_P1) {
            maior2 = Math.max(nota_P2, nota_P3);
        } else if (maior1 == nota_P2) {
            maior2 = Math.max(nota_P1, nota_P3);
        } else {
            maior2 = Math.max(nota_P1, nota_P2);
        }
        return (maior1 + maior2) / 2;
    }
    
    public String Resultado() {
        if (MediaAluno() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
