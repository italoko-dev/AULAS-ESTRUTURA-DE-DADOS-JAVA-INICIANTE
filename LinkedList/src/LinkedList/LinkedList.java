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
        if(head == null) // Nossa está vazia.
            head = no;
        else{ //ja tem elemento.
            No aux = head;
            
            while(aux.getProx()!= null)
                aux = aux.getProx();
            
            aux.setProx(no);
        }
    }
    
    public boolean alter(int pos, Object data){
        
        No aux = head;
        for (int i = 0; aux!= null && i < pos; i++) {
            aux = aux.getProx();
        }
        
        if(aux != null)
        {
            aux.setData(data);
            return true;
        }
        return false;  
    }
    
    public boolean  remove(int pos){
        
        if(head != null) // tem alguém na lista?
        {
            if(head.getProx() == null) //1 possibilidade , só tem 1 elemento ?
                head = null;
            else{
                if(pos == 0)
                    head = head.getProx();
                else
                {
                    No aux = head;
                    No ant = head;

                    for (int i = 0; aux != null && i < pos; i++) {
                        ant = aux;
                        aux = aux.getProx();
                    }

                    if(aux != null) // Meio ou Final.
                    {
                        ant.setProx(aux.getProx());
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
