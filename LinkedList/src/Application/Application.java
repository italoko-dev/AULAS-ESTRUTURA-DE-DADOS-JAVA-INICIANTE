package Application;
import LinkedList.LinkedList;
/**
 *
 * @author ITALO PIOVAN
 */
public class Application {
    public static void main(String[] args) {
        
        Produto prod1 = new Produto("PRODUTO 1 ",10);
        Produto prod2 = new Produto("PRODUTO 2 ",20);
        Produto prod3 = new Produto("PRODUTO 3 ",40);
        Produto prod4 = new Produto("PRODUTO 4 ",50);
        
        Produto prodAlterado = new Produto("PRODUTO Alterado ",100);
        
        
        
        LinkedList listaDeProdutos = new LinkedList();
        
        listaDeProdutos.insert(prod1);
        listaDeProdutos.insert(prod2);
        listaDeProdutos.insert(prod3);
        listaDeProdutos.insert(prod4);
        
        //listaDeProdutos.alter(2, prodAlterado);
        listaDeProdutos.remove(0);
        
        listaDeProdutos.printAll();
    }
}
