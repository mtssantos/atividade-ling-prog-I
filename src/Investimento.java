public class Investimento {
    // Atributos
    private float valorAplic;
    private float txJuros;
    private float prazoVenc;
    private float histInvest;

    public Investimento(float valorAplic, float txJuros, float prazoVenc, float histInvest) {
        this.valorAplic = valorAplic;
        this.txJuros = txJuros;
        this.prazoVenc = prazoVenc;
        this.histInvest = histInvest;
    }

    // Métodos
    public float calculaRentabilidade() {
        float juros = valorAplic * (txJuros / 100) * (prazoVenc / 365);
        return valorAplic + juros;
    }

    public void consulRentab() {
        float valorFinal = calculaRentabilidade();
        System.out.println("Valor final do investimento: R$" + valorFinal);
    }

    public void resgate() {
        float valorFinal = calculaRentabilidade();
        System.out.println("Valor a ser resgatado: R$" + valorFinal);
        valorAplic = 0;
        System.out.println("Investimento resgatado com sucesso!");
    }

    public void investreco(float novoValor, float novaTxJuros, float novoPrazoVenc) {
        valorAplic = novoValor;
        txJuros = novaTxJuros;
        prazoVenc = novoPrazoVenc;
        System.out.println("Investimento atualizado com sucesso!");
    }

    public float getValorAplic() {
        return valorAplic;
    }

    public void setValorAplic(float valorAplic) {
        this.valorAplic = valorAplic;
    }

    public float getTxJuros() {
        return txJuros;
    }

    public void setTxJuros(float txJuros) {
        this.txJuros = txJuros;
    }

    public float getPrazoVenc() {
        return prazoVenc;
    }

    public void setPrazoVenc(float prazoVenc) {
        this.prazoVenc = prazoVenc;
    }

    public float getHistInvest() {
        return histInvest;
    }

    public void setHistInvest(float histInvest) {
        this.histInvest = histInvest;
    }
}
