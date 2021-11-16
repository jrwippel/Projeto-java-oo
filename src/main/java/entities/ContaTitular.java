package entities;

public class ContaTitular {

    private int numeroconta;
    private String nometitular;
    private double vlrdepositoini;

    public static final double TX=5.00;

    public void addDeposito(double value){
        vlrdepositoini += value;
    }

    public void remDeposito(double value){
        vlrdepositoini -= value + TX;
    }

    public String toString(){
        return "Account"
                + " "
                + numeroconta
                + ", "
                + "Holder: "
                + nometitular
                + ", "
                +"Balance: $ "
                + vlrdepositoini;
    }

    public ContaTitular(){

    }

    public ContaTitular(int numeroconta, String nometitular, double vlrdepositoini) {
        this.numeroconta = numeroconta;
        this.nometitular = nometitular;
        addDeposito(vlrdepositoini);
    }

    public ContaTitular(int numeroconta, String nometitular) {
        this.numeroconta = numeroconta;
        this.nometitular = nometitular;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public double getVlrdepositoini() {
        return vlrdepositoini;
    }


}
