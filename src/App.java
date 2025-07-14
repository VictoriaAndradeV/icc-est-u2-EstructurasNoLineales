
import materia.controller.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insert(50);
        arbolBinario.insert(17);
        arbolBinario.insert(76);
        arbolBinario.insert(9);
        arbolBinario.insert(50);
        arbolBinario.insert(23);
        arbolBinario.insert(54);
        arbolBinario.insert(14);
        arbolBinario.insert(19);

        arbolBinario.imprimirArbol();

        int valorBuscado = 23;
        if(arbolBinario.buscar(valorBuscado)== true) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el arbol.");
        }else{
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arbol.");
        }
    }
}
