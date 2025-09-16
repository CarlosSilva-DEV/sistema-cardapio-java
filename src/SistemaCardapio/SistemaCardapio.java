package SistemaCardapio;
public class SistemaCardapio {
    public static void main(String[] args) {
        Cardapio produto1 = new Cardapio();
        produto1.getCodProduto();
        produto1.setCodProduto(001);
        produto1.getNomeProduto();
        produto1.setNomeProduto("X-Tudo");
        produto1.getCategoriaProduto();
        produto1.setCategoriaProduto("Lanches");
        produto1.getValorProduto();
        produto1.setValorProduto(19.90);
        produto1.getDescProduto();
        produto1.setDescProduto("Pão brioche, hamburguer com carne Angus, ovo frito, bacon e salada com molho caesar");

        Cardapio produto2 = new Cardapio();
        produto2.getCodProduto();
        produto2.setCodProduto(002);
        produto2.getNomeProduto();
        produto2.setNomeProduto("Pastel");
        produto2.getCategoriaProduto();
        produto2.setCategoriaProduto("Salgados");
        produto2.getValorProduto();
        produto2.setValorProduto(7.9);
        produto2.getDescProduto();
        produto2.setDescProduto("Pastel de massa crocante com vinagrete nos sabores pizza, calabresa com catupiry, 4 queijos e carne louca");
        
        Cardapio produto3 = new Cardapio();
        produto3.getCodProduto();
        produto3.setCodProduto(003);
        produto3.getNomeProduto();
        produto3.setNomeProduto("Refrigerante 350ml");
        produto3.getCategoriaProduto();
        produto3.setCategoriaProduto("Bebidas");
        produto3.getValorProduto();
        produto3.setValorProduto(6.50);
        produto3.getDescProduto();
        produto3.setDescProduto("Sabores: Coca-Cola, Pepsi, Guaraná Antarctica, Sprite e Fanta");
        
        Cardapio produto4 = new Cardapio();
        produto4.getCodProduto();
        produto4.setCodProduto(004);
        produto4.getNomeProduto();
        produto4.setNomeProduto("Combo X-Tudo + Bebida");
        produto4.getCategoriaProduto();
        produto4.setCategoriaProduto("Combos");
        produto4.getValorProduto();
        produto4.setValorProduto(22.90);
        produto4.getDescProduto();
        produto4.setDescProduto("O melhor dos cenários: um bom lanche acompanhado de uma boa bebida!");
        
        Cardapio.exibirCardapio();
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
        produto4.exibirProduto();
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
    
    public void exibirProduto() {
        System.out.println("Código do Produto: " + codProduto);
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Categoria: " + categoriaProduto);
        System.out.println("Valor: R$ " + valorProduto);
        System.out.println("Descrição: " + descProduto);
        System.out.println("------------------------------------");
    }
    
    public static void exibirCardapio() {
        System.out.println("------------------------------------");
        System.out.println("LANCHONETE SILVA & SANTOS - CARDAPIO");
        System.out.println("------------------------------------");
    }
}