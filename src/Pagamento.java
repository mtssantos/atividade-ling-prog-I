public class Pagamento {
    //Atributos
    private float valorConta;
    private int dataVenc;
    private String nomeBenef;
    private String tipoConta;
    private float histPagamento;

    //Métodos
    public void pagConta(){
        System.out.println("Pagamento de " + valorConta + " realizado para " + nomeBenef + " na data " + dataVenc);
        histPagamento += valorConta;
    }

    public void cancelamento(){
        System.out.println("Pagamento de " + valorConta + " para " + nomeBenef + " cancelado");
    }

    public void agendamento(int novaData){
        System.out.println("Pagamento de " + valorConta + " para " + nomeBenef + " reagendado para a data " + novaData);
        dataVenc = novaData;
    }

    public void pagRecorrentes(int qtdParcelas){
        float valorParcela = valorConta / qtdParcelas;
        for(int i=1; i<=qtdParcelas; i++){
            System.out.println("Pagamento da parcela " + i + "/" + qtdParcelas + " de " + valorParcela + " realizado para " + nomeBenef + " na data " + dataVenc);
            histPagamento += valorParcela;
            dataVenc += 30; //incrementa a data de vencimento em 30 dias para cada parcela
        }
    }

    public float getValorConta() {
        return valorConta;
    }

    public void setValorConta(float valorConta) {
        this.valorConta = valorConta;
    }

    public int getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(int dataVenc) {
        this.dataVenc = dataVenc;
    }

    public String getNomeBenef() {
        return nomeBenef;
    }

    public void setNomeBenef(String nomeBenef) {
        this.nomeBenef = nomeBenef;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getHistPagamento() {
        return histPagamento;
    }

    public void setHistPagamento(float histPagamento) {
        this.histPagamento = histPagamento;
    }
}