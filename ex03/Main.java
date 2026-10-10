public class Main{
    public static void main (String[] args){
        Produto produto1 = new Produto("Coca-cola lata", 8.00, 0);
        produto1.exibirResumo();

        produto1.setNome("COCA-COLA LATA");
        produto1.getNome();

        produto1.setPreco(10.00);
        produto1.getPreco();

        produto1.adicionarEstoque(10);
        produto1.getQtdEmEstoque();

        produto1.adicionarEstoque(0);

        produto1.vender(8);
        produto1.getQtdEmEstoque();

        produto1.vender(0);
        produto1.vender(3);
        produto1.getQtdEmEstoque();

        produto1.exibirResumo();
    }
}
