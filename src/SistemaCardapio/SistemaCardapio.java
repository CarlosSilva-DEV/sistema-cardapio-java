package SistemaCardapio;
public class SistemaCardapio {
    public static void main(String[] args) {
        Cardapio produto1 = new Cardapio();
        produto1.setCodProduto(001);
        produto1.setNomeProduto("X-Tudo");
        produto1.setCategoriaProduto("Lanches");
        produto1.setValorProduto(19.90);
        produto1.setDescProduto("Pão brioche, hamburguer com carne Angus, ovo frito, bacon e salada com molho caesar");

        Cardapio produto2 = new Cardapio();
        produto2.setCodProduto(002);
        produto2.setNomeProduto("Pastel");
        produto2.setCategoriaProduto("Salgados");
        produto2.setValorProduto(7.9);
        produto2.setDescProduto("Pastel de massa crocante com vinagrete nos sabores pizza, calabresa com catupiry, 4 queijos e carne louca");
        
        Cardapio produto3 = new Cardapio();
        produto3.setCodProduto(003);
        produto3.setNomeProduto("Refrigerante 350ml");
        produto3.setCategoriaProduto("Bebidas");
        produto3.setValorProduto(6.50);
        produto3.setDescProduto("Sabores: Coca-Cola, Pepsi, Guaraná Antarctica, Sprite e Fanta");
        
        Cardapio produto4 = new Cardapio();
        produto4.setCodProduto(004);
        produto4.setNomeProduto("Combo X-Tudo + Bebida");
        produto4.setCategoriaProduto("Combos");
        produto4.setValorProduto(22.90);
        produto4.setDescProduto("O melhor dos cenários: um bom lanche acompanhado de uma boa bebida!");
        
        Cardapio.exibirCardapio();
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
        produto4.exibirProduto();
    }  
}