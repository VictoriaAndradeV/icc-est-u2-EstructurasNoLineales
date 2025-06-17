package materia.models;

public class Node {
    private int value;
    private Node izquierda;
    private Node derecha;

    public Node(int value) {
        this.value = value;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int valor) {
        this.value = valor;
    }

    public Node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }

    public Node getDerecha() {
        return derecha;
    }

    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "Node [valor=" + value + "]";
    }
    

}
