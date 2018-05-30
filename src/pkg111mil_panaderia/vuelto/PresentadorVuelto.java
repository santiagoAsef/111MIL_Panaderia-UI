/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil_panaderia.vuelto;

/**
 *
 * @author utku35
 */
public class PresentadorVuelto implements ContratoPresentadorVuelto {
    private ContratoVistaVuelto vista;
    public PresentadorVuelto(ContratoVistaVuelto vista){
        this.vista = vista;
    }
    @Override
    public void iniciar(){
        this.vista.getEscena();
    }
    @Override
    public void botonPresionado(){
        this.vista.volverAlMenuPrincipal();
    }
}
