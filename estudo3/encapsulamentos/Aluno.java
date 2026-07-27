package encapsulamentos;

public class Aluno {
    private double nota;

    public Aluno(double nota){
        setNota(nota);
    }

    public void setNota(double nota){
        if(nota < 0 || nota > 100){
            System.out.println("a nota só pode ficar entre 0 e 100");
            return;
        }
        this.nota = nota;
    }
}
