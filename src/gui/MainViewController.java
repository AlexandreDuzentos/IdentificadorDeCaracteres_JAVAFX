package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MainViewController {
	
	//Números
	@FXML
	private Button zero;
	@FXML
	private Button one;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button four;
	@FXML
	private Button five;
	@FXML
	private Button six;
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	@FXML
	private Button nine;
	
	//Operadores
	@FXML
	private Button plus;
	@FXML
	private Button minus;
	@FXML
	private Button mult;
	@FXML
	private Button div;
	@FXML
	private Button restdiv;
	
	//Caracteres
	@FXML
	private Button A;
	@FXML
	private Button B;
	@FXML
	private Button C;
	@FXML
	private Button D;
	@FXML
	private Button E;
	@FXML
	private Button F;
	@FXML
	private Button G;
	@FXML
	private Button H;
	@FXML
	private Button I;
	@FXML
	private Button J;
	@FXML
	private Button K;
	@FXML
	private Button L;
	@FXML
	private Button M;
	@FXML
	private Button N;
	@FXML
	private Button O;
	@FXML
	private Button P;
	@FXML
	private Button Q;
	@FXML
	private Button R;
	@FXML
	private Button S;
	@FXML
	private Button T;
	@FXML
	private Button U;
	@FXML
	private Button V;
	@FXML
	private Button X;
	@FXML
	private Button W;
	@FXML
	private Button Y;
	@FXML
	private Button Z;
	@FXML
	private Button limpar;
	
	
	//Caracteres especias
	@FXML
	private Button euro;
	@FXML
	private Button dolar;
	@FXML
	private Button esclamacao;
	@FXML
	private Button hashtag;
	@FXML
	private Button parentesesdeabertura;
	@FXML
	private Button parentesesdefechamento;
	@FXML
	private Button chavesdeabertura;
	@FXML
	private Button chavesdefechamento;
	@FXML
	private Button parentesesretosdefechamento;
	@FXML
	private Button parenteseretosdeabertura;
	@FXML
	private Button igual;
	@FXML
	private Button ponto;
	@FXML
	private Button interrogacao;
	@FXML
	private Button underline;
	@FXML
	private Button doispontos;
	@FXML
	private Button maior;
	@FXML
	private Button menor;
	@FXML
	private Button arroba;
	@FXML
	private Button asterisco;

	//Outros
	@FXML
	private TextField mostrar;
	@FXML
	private Label label;
	@FXML
	private Button Testar;
	
	
	@FXML
	public void onBtAction(ActionEvent event){
	 if(event.getSource() ==  A){
	  mostrar.setText(mostrar.getText() + "A");
	}else if(event.getSource() ==  B){
	   mostrar.setText(mostrar.getText() + "B");
	}else if(event.getSource() ==  C){
	   mostrar.setText(mostrar.getText() + "C");
	}else if(event.getSource()== D){
	   mostrar.setText(mostrar.getText() + "D");
	}else if(event.getSource()== E){
	   mostrar.setText(mostrar.getText() + "E");
	}else if(event.getSource()== F){
	   mostrar.setText(mostrar.getText() + "F");
	}else if(event.getSource()== G){
	   mostrar.setText(mostrar.getText() + "G");
	}else if(event.getSource()== H){
	   mostrar.setText(mostrar.getText() + "H");
	}else if(event.getSource()== I){
	   mostrar.setText(mostrar.getText() + "I");
	}else if(event.getSource()== J){
	   mostrar.setText(mostrar.getText() + "J");
	}else if(event.getSource()== K){
	   mostrar.setText(mostrar.getText() + "K");
	}else if(event.getSource()== L){
	   mostrar.setText(mostrar.getText() + "L");
	}else if(event.getSource()== M){
	   mostrar.setText(mostrar.getText() + "M");
	}else if(event.getSource()== N){
	   mostrar.setText(mostrar.getText() + "N");
	}else if(event.getSource()== O){
	   mostrar.setText(mostrar.getText() + "O");
	}else if(event.getSource()== P){
	   mostrar.setText(mostrar.getText() + "P");
	}else if(event.getSource()== Q){
	   mostrar.setText(mostrar.getText() + "Q");
	}else if(event.getSource()== R){
	   mostrar.setText(mostrar.getText() + "R");
	}else if(event.getSource()== S){
	   mostrar.setText(mostrar.getText() + "S");
	}else if(event.getSource()== T){
	   mostrar.setText(mostrar.getText() + "T");
	}else if(event.getSource()== U){
	   mostrar.setText(mostrar.getText() + "U");
	}else if(event.getSource()== V){
	   mostrar.setText(mostrar.getText() + "V");
	}else if(event.getSource()== X){
	   mostrar.setText(mostrar.getText() + "X");
	}else if(event.getSource()== Y){
	   mostrar.setText(mostrar.getText() + "Y");
	}else if(event.getSource()== zero) {
		mostrar.setText(mostrar.getText()+"0");
	}else if(event.getSource()== Z){
	   mostrar.setText(mostrar.getText() + "Z");
	}else if(event.getSource()== one){
	   mostrar.setText(mostrar.getText() + "1");
	}else if(event.getSource()== two){
	   mostrar.setText(mostrar.getText() + "2");
	}else if(event.getSource()== three){
	   mostrar.setText(mostrar.getText() + "3");
	}else if(event.getSource()== four){
	   mostrar.setText(mostrar.getText() + "4");
	}else if(event.getSource()== five){
	   mostrar.setText(mostrar.getText() + "5");
	}else if(event.getSource()== six){
	   mostrar.setText(mostrar.getText() + "6");
	}else if(event.getSource()== seven){
	   mostrar.setText(mostrar.getText() + "7");
	}else if(event.getSource()== eight){
	   mostrar.setText(mostrar.getText() + "8");
	}else if(event.getSource()== nine){
	   mostrar.setText(mostrar.getText() + "9");
	}else if(event.getSource()== esclamacao){
	   mostrar.setText(mostrar.getText() + "!");
	}else if(event.getSource()== hashtag){
	   mostrar.setText(mostrar.getText() + "#");
	}else if(event.getSource()== dolar){
	   mostrar.setText(mostrar.getText() + "$");
	}else if(event.getSource()== euro){
	   mostrar.setText(mostrar.getText() + "£");
	}else if(event.getSource()== chavesdeabertura){
	   mostrar.setText(mostrar.getText() + "{");
	}else if(event.getSource()== chavesdefechamento){
	   mostrar.setText(mostrar.getText() + "}");
	}else if(event.getSource()== parentesesdeabertura){
	   mostrar.setText(mostrar.getText() + "(");
	}else if(event.getSource()== parentesesdefechamento){
	   mostrar.setText(mostrar.getText() + ")");
	}else if(event.getSource()== parenteseretosdeabertura){
	   mostrar.setText(mostrar.getText() + "[");
	}else if(event.getSource()== parentesesretosdefechamento){
	   mostrar.setText(mostrar.getText() + "]");
	}else if(event.getSource()== interrogacao){
	   mostrar.setText(mostrar.getText() + "?");
	}else if(event.getSource()== underline){
	   mostrar.setText(mostrar.getText() + "_");
	}else if(event.getSource()== ponto){
	   mostrar.setText(mostrar.getText() + ".");
	}else if(event.getSource()== plus){
	   mostrar.setText(mostrar.getText() + "+");
	}else if(event.getSource()== minus){
	   mostrar.setText(mostrar.getText() + "-");
	}else if(event.getSource()== div){
		mostrar.setText(mostrar.getText() + "/");
	}else if(event.getSource()== mult){
	   mostrar.setText(mostrar.getText() + "x");
	}else if(event.getSource()== restdiv){
	   mostrar.setText(mostrar.getText() + "%");
	}else if(event.getSource()== doispontos){
		   mostrar.setText(mostrar.getText() + ":");
	}else if(event.getSource()== maior){
		   mostrar.setText(mostrar.getText() + ">");
	}else if(event.getSource()== menor){
		   mostrar.setText(mostrar.getText() + "<");
	}else if(event.getSource()== asterisco){
		   mostrar.setText(mostrar.getText() + "*");
	}else if(event.getSource()== igual){
		mostrar.setText(mostrar.getText() +"=");
	}else if(event.getSource() == arroba) {
		 mostrar.setText(mostrar.getText() + "@");
	}else if(event.getSource()== limpar){
		   mostrar.setText("");
		   label.setText("");
	}
	}



@FXML
public void onBtTestarAction() {
	String value = mostrar.getText();
	
	if(value.equals("A")  || value.equals("E") || value.equals("I") || value.equals("O")  || value.equals("U")) {
		label.setText(value+" é uma letra vogal");
	}else if(value.equals("B")  || value.equals("C") || value.equals("D")  || value.equals("F")  || value.equals("G")  || value.equals("H")  || value.equals("J" )  || value.equals("K")  || value.equals("L")  || value.equals("M") || value.equals("N" ) || value.equals("P")  || value.equals("Q") || value.equals("R")  || value.equals("S")  || value.equals("T")  || value.equals("V") || value.equals("X")  || value.equals("Y")  || value.equals("Z") ) {
		label.setText(value+" é uma letra consoante");
	}else if(value.equals("!")  || value.equals ("?") || value.equals("(")  || value.equals(")") || value.equals("{") || value.equals("}") || value.equals("[") || value.equals("]") || value.equals("." )|| value.equals( "?") || value.equals("_" )  || value.equals(":") || value.equals(">")  || value.equals("<" ) || value.equals("*")  || value.equals("@") || value.equals("#") || value.equals("$") || value.equals("£") || value.equals("=")) {
		label .setText(value+" é um caractér especial");
	}else if(value.equals("+" ) || value.equals("-") || value.equals("x") || value.equals("/")  || value.equals("%") ) {
		label.setText(value+" é um operador aritmético");	
	}else if(value.matches("\\d*")) {
		label.setText(value+" é um número");
	}
	
      if(value.contentEquals("") || value.contentEquals("ABC")) {
    	  label.setText("Formato incorreto");
      }
	
	
	
}
}



