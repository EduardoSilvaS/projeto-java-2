
class Produto {
    private int id;
    private String descricao;
    private double valor;
    private static int quantidade = 0;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.id = ++quantidade;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        this.valor += novoValor;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescrição: " + descricao + "\nValor: R$" + valor;
    }
}
