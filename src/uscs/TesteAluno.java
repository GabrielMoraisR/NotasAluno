package uscs;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno X1 = new Aluno("Paulo", 55123, "800912345-12", 'M', 7.0, 6.0, 8.0);
        Aluno X2 = new Aluno("Ana", 991239, "500876123-15", 'F', 2.0, 6.0, 9.0);
        
        X1.ImprimeAluno();
        X2.ImprimeAluno();
        
        System.out.println(X1.ImprimeSexo());
        System.out.println(X2.ImprimeSexo());
    }
}
