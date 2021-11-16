package entities;

public class Imc {

    public double peso;
    public double altura;
    public String genero;

    public double calculaimc(){
        return peso / (altura * altura);
    }

    public String classificao(){
        if (genero == "M"){
            if (calculaimc() >= 19.0 && calculaimc() < 24.9){
                return "Ideal";
            }else if (calculaimc() >= 25.0 && calculaimc() < 27.7){
                return "Risco Moderado";
            }else if (calculaimc() > 27.8){
                return "Risco Elevado";
            }else{
                return "Não aplicavel";
            }
        }else {
            if (calculaimc() >= 18.0 && calculaimc() < 24.4){
                return "Ideal";
            }else if (calculaimc() >= 24.5 && calculaimc() < 27.2){
                return "Risco Moderado";
            }else if (calculaimc() > 27.3){
                return "Risco Elevado";
            }else{
                return "Não aplicavel";
            }
        }
    }
}
