package SistemaCardapio;
public class SistemaCardapio {
    public static void main(String[] args) {
        
    }  
}

class Cardapio {
    private int codProduto;
    private String nomeProduto;
    private String categoriaProduto;
    private double valorProduto;
    private String descProduto;
    
    public int getCodProduto() {
        return this.codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public String getCategoriaProduto() {
        return this.categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    
    public double getValorProduto() {
        return this.valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public String getDescProduto() {
        return this.descProduto;
    }
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }
}