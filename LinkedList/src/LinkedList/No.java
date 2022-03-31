package LinkedList;

/**
 *
 * @author ITALO PIOVAN
 */
public class No {

    public No(Object data) {
        this.data = data;
        this.prox = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    private Object data;
    private No prox;
}
