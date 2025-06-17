package materia.controller;

import materia.models.Node;

public class ArbolBinario {
    private Node root;

    public ArbolBinario(){
        this.root = null;
    }

    public void insert(int value){
        root = insertRecursivo(root, value);

    }

    private Node insertRecursivo(Node padre, int value){
        if(padre == null){
            return new Node(value);
        } else if(value < padre.getValue()){
            padre.setIzquierda(insertRecursivo(padre.getIzquierda(), value));
        } else if (value > padre.getValue()){
            padre.setDerecha(insertRecursivo(padre.getDerecha(), value));
        }
        return padre;//retorno padre en caso de nodos repetidos
        //solo retorna el nodo actual sin modificaciones 
    }

    public void imprimirArbol(){
        imprimirRecursivo(root);
    }

    private void imprimirRecursivo(Node node){
        if(node != null){
            /*IN ORDER
             * imprimirRecursivo(node.getIzquierda());
                System.out.println(node.getValue() + ", ");
                imprimirRecursivo(node.getDerecha());
             */

            // PRE ORDEN 
            System.out.println(node.getValue() + ", ");
            imprimirRecursivo(node.getIzquierda());
            imprimirRecursivo(node.getDerecha());
            

        }
    }

}
