package materia.controller;

import materia.models.Node;

public class ArbolBinario {
    private Node root; // todo arbol binario tiene un nodo raiz, punto de partida

    public ArbolBinario() { // constructor
        this.root = null; // se inicializa el arbol vacio
    }

    public void insert(int value) { // metodo para insertar valors en los nodos
        root = insertRecursivo(root, value);
    }

    private Node insertRecursivo(Node padre, int value) { // nodo padre es el nodo actual
        // creamos un nuevo nodo si el padre es nulo
        if (padre == null) {
            return new Node(value);

        } else if (value < padre.getValue()) {
            padre.setIzquierda(insertRecursivo(padre.getIzquierda(), value));

        } else if (value > padre.getValue()) {
            padre.setDerecha(insertRecursivo(padre.getDerecha(), value));
        }
        return padre;// retorno padre en caso de nodos repetidos
        // solo retorna el nodo actual sin modificaciones
    }

    public void imprimirArbol() {
        imprimirRecursivo(root);
    }

    // para imprimir solo pasamos el nodo como parametro
    private void imprimirRecursivo(Node node) {
        if (node != null) {
            /*
             * IN ORDER
             * imprimirRecursivo(node.getIzquierda());
             * System.out.println(node.getValue() + ", ");
             * imprimirRecursivo(node.getDerecha());
             */

            //PRE ORDEN
            System.out.println(node.getValue() + ", ");
            imprimirRecursivo(node.getIzquierda());
            imprimirRecursivo(node.getDerecha());
        }
    }

    public boolean buscar(int value) {
        return buscarRec(root, value);
    }

    private boolean buscarRec(Node node, int valor) {
        if(node == null){
            return false; //retornamos falso si no existen nodos en el arbol
        }
        if(node.getValue() == valor){
            return true; //se retorna true si los valores coinciden
        } else if(valor < node.getValue()){
            return buscarRec(node.getIzquierda(), valor); //buscamos en el subarbol izquierdo
        }else {
            return buscarRec(node.getDerecha(), valor); //buscamos en el subarbol derecho
        }
    }

}
