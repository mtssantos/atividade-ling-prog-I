public class Main {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente("arthur vieira", 1111, 0, 0, 0, 5000);
        CartaoCredito c1 = new CartaoCredito(1400,1400,06, "asda");
        p1.estadoAtual();
        p1.deposito(1000);
        p1.saque(500);
        c1.compra(500);


        Emprestimo e1 = new Emprestimo();
        e1.simEmprest(1000,6,5);

    }
}