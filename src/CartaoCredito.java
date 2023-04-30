public class CartaoCredito {
    //Atributos
    private float limCred;
    private float saldoDips;
    private int dataVenc;
    private int histComp;

    public CartaoCredito(float lc, float sd, int dv, String hc) {
        this.limCred = lc;
        this.saldoDips = sd;
        this.dataVenc = dv;
        this.histComp = Integer.parseInt(hc);
    }

    // Métodos
    public void compra(float v){
        if (v <= this.limCred - this.saldoDips) { // verifica se a compra é possível dentro do limite de crédito
            this.saldoDips += v; // adiciona o valor da compra ao saldo devido
            this.histComp++; // incrementa o histórico de compras
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Compra não realizada: limite de crédito insuficiente!");
        }
    }

    public float consultarFatura(){
        float valorFatura = this.saldoDips;
        if (this.saldoDips > 0) { // adiciona a taxa de juros se houver saldo devedor
            valorFatura *= 1.05f;
        }
        return valorFatura;
    }

    public void pagamento(float v){
        if (v <= this.saldoDips) { // verifica se o valor do pagamento é menor ou igual ao saldo devido
            this.saldoDips -= v; // subtrai o valor do pagamento do saldo devido
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Pagamento não realizado: valor maior que o saldo devido!");
        }
    }

    public void bloquearCartao(){
        System.out.println("Cartão bloqueado!");
    }

    public void aumentarLimite(float v){
        this.limCred += v;
        System.out.println("Limite de crédito aumentado para " + this.limCred);
    }

    public void diminuirLimite(float v){
        if (v <= this.limCred - this.saldoDips) { // verifica se o novo limite é suficiente para cobrir o saldo devido
            this.limCred -= v;
            System.out.println("Limite de crédito diminuído para " + this.limCred);
        } else {
            System.out.println("Operação não realizada: novo limite não cobre o saldo devido!");
        }
    }

    // Getters e Setters
    public float getLimCred() {
        return limCred;
    }

    public void setLimCred(float limCred) {
        this.limCred = limCred;
    }

    public float getSaldoDips() {
        return saldoDips;
    }

    public void setSaldoDips(float saldoDips) {
        this.saldoDips = saldoDips;
    }

    public int getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(int dataVenc) {
        this.dataVenc = dataVenc;
    }

    public int getHistComp() {
        return histComp;
    }

    public void setHistComp(int histComp) {
        this.histComp = histComp;
    }
}
