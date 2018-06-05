/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil_panaderia.vuelto;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
    private HBox lienzo;
    private Button boton;
    private ImageView billete5pe;
  
    public VistaVuelto(UI controlador){
        this.controlador = controlador;
        this.crearVentana();
        this.presentador = new PresentadorVuelto(this);
        this.presentador.iniciar();
         
        
    }
    private void crearVentana(){
        this.lienzo = new HBox();
        this.escena = new Scene(this.lienzo, 600, 600);
        this.boton = new Button();
        boton.setText("Volver.");
        String url = "https://i1.wp.com/fortunaweb.com.ar/wp-content/uploads/2015/09/20150925_1029_economia_sin-tixtulo-1.jpg_1853027552.jpg?fit=728%2C500https://i1.wp.com/fortunaweb.com.ar/wp-content/uploads/2015/09/20150925_1029_economia_sin-tixtulo-1.jpg_1853027552.jpg?fit=728%2C500";
        Image image = new Image(url);
        billete5pe = new ImageView(image);
        //billete5pe= new ImageView("src/billetes/5pesos.jpg");
        billete5pe.setFitHeight(200.00);
        billete5pe.setFitWidth(350.00);
        lienzo.getChildren().add(billete5pe);
        
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
