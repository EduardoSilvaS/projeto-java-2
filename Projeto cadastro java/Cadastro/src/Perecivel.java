
class Perecivel extends Produto {
    private int[] validade;

    public Perecivel(String descricao, double valor, int[] validade) {
        super(descricao, valor);
        this.validade = validade;
    }

    public boolean estaVencido() {
        int diaAtual = 9; // Suponha que seja 9 de outubro
        int mesAtual = 10; // Suponha que seja outubro
        int anoAtual = 2023; // Suponha que seja 2023

        if (anoAtual > validade[2]) {
            return true;
        } else if (anoAtual == validade[2] && mesAtual > validade[1]) {
            return true;
        } else if (anoAtual == validade[2] && mesAtual == validade[1] && diaAtual > validade[0]) {
            return true;
        }

        return false;
    }

    public void aplicaDesconto(double percentualDesconto) {
        double desconto = (percentualDesconto / 100) * super.getValor();
        setValor(-desconto);
    }

    @Override
    public String toString() {
        String infoProduto = super.toString();
        String infoValidade = "\nData de Validade: " + validade[0] + "/" + validade[1] + "/" + validade[2];
        return infoProduto + infoValidade;
    }
}
