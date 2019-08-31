
package App;

public class Celular extends ProdutoAcabado {
    private String modelo;
    //private String nomeC;
    
    /**
    public void Celular(){
        this.nomeC = "LG";
        this.modelo = "K11+";
        
    }
    */
    
    public Celular(String nome,String modelo, float valor,String loja ,int estoque ){
        super.setNome(nome);
        this.setModelo(modelo);
        super.setValor(valor);
        super.setLoja(loja);
        super.setEstoque(estoque);     
        
        
    }
    
    public void status() {
        System.out.println("Sobre o Celular:");
        System.out.println("Marca:" + this.getNome());
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Valor:" + this.getValor());
        System.out.println("Loja:" + this.getLoja());
        System.out.println("Estoque:" + this.getEstoque());
        
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //public String getNomeC() {
    //    return nomeC;
    //}

    //public void setNomeC(String nomeC) {
    //    this.nomeC = nomeC;
    //}
    
    
}
