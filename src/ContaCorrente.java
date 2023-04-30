import java.util.ArrayList;

public class ContaCorrente {

    //Atributos
    private float saldo;
    //Valor que tem na conta

    private int numeroConta;
    private String nomeTitular;
    private float histTransac;
    private float extrato;

    private float limCheEsp;



    public void deposito(float v){

        this.setSaldo(getSaldo() + v);
        System.out.println("Depósito de " + v );
    }
    public void saque(float v){
        this.setSaldo(getSaldo() - v);
        System.out.println("Saque de " + v );
    }
    public void consulSaldo(){
        System.out.println("Saldo atual: R$" + this.getSaldo());
    }
    //Metodos especiais


    public ContaCorrente(String nt, int nc, float sa, float ht, float ext, float lce) {
        this.nomeTitular = nt;
        this.numeroConta = nc;
        this.saldo = sa;
        this.histTransac = ht;
        this.extrato = ext;
        this.limCheEsp = lce;
        saldo = 0;

    }
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("=========");
        System.out.println("Titular: " + this.getNomeTitular());
        System.out.println("Número da Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Limite do cheque especial: " + this.getLimCheEsp());
        System.out.println("Extrato: " );
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getHistTransac() {
        return histTransac;
    }

    public void setHistTransac(float histTransac) {
        this.histTransac = histTransac;
    }

    public float getExtrato() {
        return extrato;
    }

    public void setExtrato(float extrato) {
        this.extrato = extrato;
    }

    public float getLimCheEsp() {
        return limCheEsp;
    }

    public void setLimCheEsp(float limCheEsp) {
        this.limCheEsp = limCheEsp;
    }
}
