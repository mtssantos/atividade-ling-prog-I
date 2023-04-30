public class Emprestimo {
    //Atributos
    private float emprestimo;
    private int prazo;
    private float txJuros;
    private float histEmprest;

    //Metodos
    public void simEmprest(float v, int p, float j){
        this.emprestimo = v;
        this.prazo = p;
        this.txJuros = j;
        System.out.println("Simulação de empréstimo realizada com sucesso!");
    }

    public void solEmprest(){
        System.out.println("Empréstimo solicitado com sucesso!");
    }

    public void consultarParc(){
        float parc = (this.emprestimo + (this.emprestimo * this.txJuros)) / this.prazo;
        System.out.println("O valor das parcelas é de: R$ " + parc);
    }

    public void pagarAnte(){
        System.out.println("Pagamento antecipado realizado com sucesso!");
    }

    public float getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(float emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public float getTxJuros() {
        return txJuros;
    }

    public void setTxJuros(float txJuros) {
        this.txJuros = txJuros;
    }

    public float getHistEmprest() {
        return histEmprest;
    }

    public void setHistEmprest(float histEmprest) {
        this.histEmprest = histEmprest;
    }
}
