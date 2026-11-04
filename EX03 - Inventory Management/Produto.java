public class Produto {
    private String nome;
    private double preco;
    private int qtdEmEstoque = 0;

    public Produto(String nome, double preco, int qtdEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    // SETTERS 
    public void setNome(String novoNome){
        nome = novoNome;
        System.out.printf("\n\nNome atualizado com sucesso! Novo nome: %s", nome);
    }
    
    public void setPreco(double novoPreco){
        preco = novoPreco;
        System.out.printf("\n\nPreço atualizado com sucesso! Novo preço: %.2f", preco);
    }
    
    // GETTERS
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtdEmEstoque(){
        return qtdEmEstoque;
    }

    // MÉTODOS
    public void adicionarEstoque(int quantidade){
        if(quantidade > 0) { 
            qtdEmEstoque += quantidade;
            System.out.printf("\n\nQuantidade adicionada com sucesso! Quantidade em Estoque: %d", qtdEmEstoque);
        }
        else {
            System.out.printf("\n\nErro! A quantidade deve ser maior que 0. Tente novamente.");
        }
    }

    public void vender(int quantidade){
        if (quantidade > 0 && qtdEmEstoque >= quantidade){
            qtdEmEstoque -= quantidade;
            System.out.printf("\n\nQuantidade vendida com sucesso!");
            System.out.printf("\nQuantidade em estoque agora: %d", qtdEmEstoque);
            System.out.printf("\nQuantidade vendida: %d", quantidade);
        }
        else { 
            System.out.printf("\n\nErro! Estoque insuficiente para venda ou quantidade =< 0");
        }
    }

    public void exibirResumo(){
        System.out.printf("\n\n~~~~ RESUMO ~~~~\n");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtdEmEstoque);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

}