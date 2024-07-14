/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diegoalvarez.main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    
    double valor1,valor2,result,contador;
    int op;
    @FXML private TextField txtPantalla;
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMulti;
    @FXML private Button btnDiv;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnUnoX;
    @FXML private Button btnCuadrado;
    @FXML private Button btnRaiz;
    
    @FXML
        private void handleButtonAction(ActionEvent event) {
        if (event.getSource()==btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource()==btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource()==btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource()==btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource()==btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource()==btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource()==btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource()==btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource()==btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource()==btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource()==btnPunto){
            double num = Double.parseDouble(txtPantalla.getText());
        if (num == 0) {
            txtPantalla.setText("");
        } else {
           if (!txtPantalla.getText().contains(".")) {
               txtPantalla.setText(txtPantalla.getText()+".");
           }
           }
       }else if (event.getSource()==btnMasMenos){
            String valor = txtPantalla.getText();
            double num = Double.parseDouble(txtPantalla.getText());
        if (num == 0) {
            txtPantalla.setText("");
        } else {
            if (valor.startsWith("-")) {
                txtPantalla.setText(valor.substring(1));
            } else {
                txtPantalla.setText("-" + valor);
            }
        }
       }else if (event.getSource() == btnUnoX) {
        double num = Double.parseDouble(txtPantalla.getText());
        if (num == 0) {
            txtPantalla.setText("");
        } else {
            double resultado = 1 / num;
            txtPantalla.setText(String.valueOf(resultado));}
        }else if (event.getSource() == btnCuadrado) {
            double num = Double.parseDouble(txtPantalla.getText());
            if (num == 0) {
            txtPantalla.setText("Error matemático");
        } else {
             valor1 = Double.parseDouble(txtPantalla.getText());
            double resultado = valor1 * valor1;
            txtPantalla.setText(String.valueOf(resultado));}
        }else if (event.getSource() == btnRaiz) {
    double num = Double.parseDouble(txtPantalla.getText());
    if (num >= 0) {
        double resultado = Math.sqrt(num);
        txtPantalla.setText(String.valueOf(resultado));
    } else {
        txtPantalla.setText("Error matemático");
    }
        }else if (event.getSource() == btnPorcentaje) {
    valor2 = Double.parseDouble(txtPantalla.getText());
    result = valor1 * (valor2 / 100);
    txtPantalla.setText(String.valueOf(result));

        }else if (event.getSource()==btnMas){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            contador=contador+valor1;
            op = 1;
        }else if (event.getSource()==btnMenos){
                valor1= Double.parseDouble(txtPantalla.getText());
                txtPantalla.setText("");
            op = 2;
        }else if (event.getSource()==btnMulti){
                valor1= Double.parseDouble(txtPantalla.getText());
                txtPantalla.setText("");
             op= 3;
        }else if (event.getSource()==btnDiv){
                valor1= Double.parseDouble(txtPantalla.getText());
                txtPantalla.setText("");
             op= 4;
        }else if (event.getSource()==btnCE){
                txtPantalla.setText("");
        }else if (event.getSource()==btnC){
                 valor1=0;
                 valor2=0;
                 contador=0;
                 result=0;
                txtPantalla.setText("");

        }else if (event.getSource()==btnIgual){
            valor2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            switch(op){
                case 1:
                    result = contador + valor2;
                    contador=0;
                    txtPantalla.setText(String.valueOf(result));
            break;
                case 2:
                    result = valor1-valor2;
                    txtPantalla.setText(String.valueOf(result));
            break;
                case 3:
                    result = valor1 * valor2;
                    txtPantalla.setText(String.valueOf(result));
            break;
                case 4:
                    if(valor2==0){
                     txtPantalla.setText(String.valueOf("Error matematico"));
                    } else {
                        result = valor1 / valor2;
                        txtPantalla.setText(String.valueOf(result));
                    }
            break;
            }

        }
    }
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
