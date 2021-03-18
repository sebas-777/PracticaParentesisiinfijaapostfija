package principalinfijapos;

import javax.swing.JOptionPane;

public class PrincipalInfijaPos {
    public static void main (String[] args) {
     String operador, posfija="", infija;
     int faltan;
     PilaInfija nuevo = new PilaInfija();
     infija = JOptionPane.showInputDialog("Ingrese la expresion artitmetica:");
     for (int i=0; i < infija.length(); i++){
         operador = Character.toString(infija.charAt(i));
         if (operador.equals("*")  || operador.equals ("/") || 
             operador.equals("+")|| operador.equals("-") ||
             operador.equals("^")){
             posfija = (nuevo.Evaluador(operador, posfija));
         }
             
         else {
             
                  if (operador.equals("(")  || operador.equals (")") ){
                  
                  posfija =nuevo.Parentesis(operador,posfija);
         } 
                  else{
                 posfija = posfija + operador;
                 }
                 }
     }
     faltan =  (infija.length()- posfija.length());
     for (int k=0; (k< faltan); k++){
         posfija = nuevo.desapilar(posfija);
     }
     JOptionPane.showMessageDialog(null, "Expresion Posfija: " + posfija);
    }   
}

