package entities;

public class Retangulo {
    public double altura;
    public double largura;

    public double area(){
        return largura * altura;
    }
    public double perimetro(){
        return (2 * largura) + (2 * altura);
    }
    public double diagonal(){
        return Math.sqrt((Math.pow(largura, 2)) + (Math.pow(altura, 2)));
    }
    public String toString(){
        return "Area:"
                + String.format("%.2f%n", area())
                + "Largura:"
                + String.format("%.2f%n",perimetro())
                + "Diagonal:"
                +String.format("%.2f%n", diagonal());

    }
}
