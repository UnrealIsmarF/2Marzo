
import Controladores.NodoControler;
import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmNodos VistaNodos = new frmNodos(VistaPrincipal, true);
        Lista NuevaLista = new Lista();
        
        //LEVANTAR CONTROLADOR
        NodoControler NuevoControlador = new NodoControler(VistaPrincipal,VistaNodos,NuevaLista);
    }
    
}
