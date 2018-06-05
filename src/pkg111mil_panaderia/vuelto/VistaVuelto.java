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
import javafx.scene.layout.BorderPane;
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
    private BorderPane superLienzo;
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
        this.superLienzo = new BorderPane();
        this.escena = new Scene(this.superLienzo, 600, 600);
        this.boton = new Button();
        boton.setText("Volver.");
        String url2 ="http://www.ellitoral.com/um/fotos/148973_1.jpg";
        Image image2 = new Image(url2);
        ImageView billete10pe = new ImageView(image2);
        billete10pe.setFitHeight(190.00);
        billete10pe.setFitWidth(305.00);
        String url1 = "https://i1.wp.com/fortunaweb.com.ar/wp-content/uploads/2015/09/20150925_1029_economia_sin-tixtulo-1.jpg_1853027552.jpg?fit=728%2C500https://i1.wp.com/fortunaweb.com.ar/wp-content/uploads/2015/09/20150925_1029_economia_sin-tixtulo-1.jpg_1853027552.jpg?fit=728%2C500";
        Image image = new Image(url1);
        billete5pe = new ImageView(image);
        //billete5pe= new ImageView("src/billetes/5pesos.jpg");
        billete5pe.setFitHeight(200.00);
        billete5pe.setFitWidth(350.00);
        superLienzo.setCenter(lienzo);
        lienzo.getChildren().add(billete5pe);
        lienzo.getChildren().add(billete10pe);
        this.superLienzo.setBottom(boton);
    }
    @Override
    public Scene getEscena() {
        return this.escena;
    }

    @Override
    public void volverAlMenuPrincipal() {
        
    }
    
}
