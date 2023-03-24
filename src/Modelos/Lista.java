
package Modelos;

import javax.swing.JOptionPane;

public class Lista {
    Nodo primero;
    Nodo Auxiliar;
    String cadena = "";
    
    public void Apilar(int dato){
        
        Nodo nuevoNodo = new Nodo(dato);
        
        if(primero == null){
            primero = nuevoNodo; 
        }
        else{
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Nodo APILADO");
    }
    
    public String Listar(){
        Auxiliar = primero;
        cadena = "";
        while(Auxiliar != null){
            cadena  = cadena + "[" + Auxiliar.getDato()+"]";
            Auxiliar = Auxiliar.siguiente;
        }
        return cadena;
    }
}
