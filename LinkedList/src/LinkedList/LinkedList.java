package LinkedList;

import Application.Produto;

/**
 *
 * @author ITALO PIOVAN
 */
public class LinkedList {
    private No head;
    
    public LinkedList(){
        head = null;
    }

    public No getHead() {
        return head;
    }
    
    public void insert(Object data){
        
        No no = new No(data);
        if(head == null) // 1º caso: Está vazia.
            head = no;
        else{ //2º caso: Ja tem elemento.
            No aux = head; // Faz "ponteiro aux" apontar para primeiro da lista.
            
            while(aux.getProx()!= null) // Percorre até o ultimo elemento.
                aux = aux.getProx();
            
            aux.setProx(no); // Faz a ligação do novo elemento com o ultimo.
        }
    }
    
    public boolean alter(int pos, Object data){
        
        No aux = head; //Faz "ponteiro aux" apontar para primeiro da lista.
        for (int i = 0; aux!= null && i < pos; i++) { //Percorre até encontrar ou quando acabar a lista.
            aux = aux.getProx();
        }
        
        if(aux != null) // Encontrou ?
        {
            aux.setData(data); // Altera os dados.
            return true;
        }
        return false;  
    }
    
    public boolean  remove(int pos){
        
        if(head != null) // 1º caso: Tem elemento na lista?
        {
            if(head.getProx() == null) //2º caso: Só tem 1 elemento ?
                head = null;
            else{
                if(pos == 0) //3º caso: É o primeiro ?
                    head = head.getProx();
                else
                {
                    No aux = head;
                    No ant = head;

                    for (int i = 0; aux != null && i < pos; i++) {
                        ant = aux;
                        aux = aux.getProx();
                    }

                    if(aux != null) //4º caso: É está no meio ou final.
                    {
                        ant.setProx(aux.getProx()); // Faz do ant->prox com aux->prox (isolando o aux).
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void printAll(){
        
        No aux = head;
        while(aux != null){
            Produto prod = (Produto)aux.getData();
            System.out.println("Nome: "+ prod.getNome() + "Quantidade: "+ prod.getQuantidade());
            aux = aux.getProx();
        }
    }
}
