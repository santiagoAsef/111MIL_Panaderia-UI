/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil_panaderia.vuelto;
import java.awt.Image;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import pkg111mil_panaderia.ui.UI;
/**
 *
 * @author utku35
 */
public class VistaVuelto implements ContratoVistaVuelto{
    private ContratoPresentadorVuelto presentador;
    private UI controlador;
    private Scene escena;
    private StackPane lienzo;
    private Button boton;
    private ImageView billete1;
    
    public VistaVuelto(UI controlador){
        this.controlador = controlador;
        this.crearVentana();
        this.presentador = new PresentadorVuelto(this);
        this.presentador.iniciar();
        this.billete1 = new ImageView("C:\\Users\\utku35\\5pe.JPEG");
        billete1.setFitHeight(15.00);
        billete1.setFitWidth(35.00);
    }
    private void crearVentana(){
        this.lienzo = new StackPane();
        this.escena = new Scene(this.lienzo, 600, 600);
        this.boton = new Button();
        boton.setText("Volver.");
        
        this.lienzo.getChildren().add(this.boton);
    }
    @Override
    public Scene getEscena() {
        return this.escena;
    }

    @Override
    public void volverAlMenuPrincipal() {
        
    }
    
}
