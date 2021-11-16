package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculamedia(){
        return nota3 + nota2 + nota1;
    }
    public String verificamedia(){
        if (calculamedia() > 60){
            return "PASS";
        }else{
            return "FAILED";
        }
    }

    public double pontosfaltam(){
        return 60 - calculamedia();
    }


}
