
package App;


public class Computador extends ProdutoAcabado {
    private String processador;
    
    public Computador(String nome, float valor, String loja, int estoque, String processador){
        super.setNome(nome);
        super.setValor(valor);
        super.setLoja(loja);
        super.setEstoque(estoque);
        this.setProcessador(processador);
    }
    
    public void status(){
        System.out.println("Sobre o Computador:");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Valor:" + this.getValor());
        System.out.println("Loja:" + this.getLoja());
        System.out.println("Quantidade:" + this.getEstoque());
        System.out.println("Processador:" + this.getProcessador());
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    
    
    
}
