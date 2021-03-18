package principalinfijapos;

import javax.swing.JOptionPane;

public class PilaInfija {
    private NodoInfija principio;
    private NodoInfija fin;
    
    public PilaInfija(){
        principio = null;
        fin = null;
    }
    
    public boolean pilaVacia(){
        return principio == null;
    }
    public void apilar (String expresion){
        NodoInfija aux = new NodoInfija (expresion, null);
        if((principio == null) && (fin == null)){
            principio=aux;
            fin=aux; 
        }
        else {
            fin.siguiente= aux;
            fin = aux;
        }
    }
    public String desapilar (String posfija3){
        String operadores;
        
        if (pilaVacia()){
            JOptionPane.showMessageDialog(null, "Pila Vacia, no se puede desapilar");
        }
        else {
            operadores =fin.expresion;
            if (principio != fin){
                fin = principio;
            }
            else {
                principio=null;
                fin = null;
            }  
            if(!operadores.equals("("))
            posfija3 = posfija3 + operadores;
        }
        return (posfija3);
    }
    public String Evaluador (String expresion2, String posfija2){
        int prioridad1=0, prioridad2=0;
        String nuevaposfija;
        if((principio == null)&&(fin ==null)){
            apilar(expresion2);
        }
        else {
            if ((fin.expresion.equals("+")) || (fin.expresion.equals("-"))){
                prioridad1=1;
            }
            if ((fin.expresion.equals("*")) || (fin.expresion.equals("/"))){
                prioridad1=2;
            }
            if(fin.expresion.equals("^")){
                prioridad1=3;
            }
            // Aqui se evalua el nuevo operador
            if ((expresion2.equals("+")) || (expresion2.equals("-"))){
                prioridad2=1;
            }
            if ((expresion2.equals("*")) || (expresion2.equals("/"))){
                prioridad2=2;
            }
            if(expresion2.equals("^")){
                prioridad2=3;
            }
            if(( prioridad2 <= prioridad1)&& (!fin.expresion.equals("("))){
                nuevaposfija = desapilar(posfija2);
                posfija2 = nuevaposfija;
                apilar(expresion2);
            }
                else {
                apilar(expresion2);
                     }
            }
            return posfija2;
} 
    
    public String Parentesis(String op, String pos ){
                    String NuevaPos;
                    if (op.equals("(")  ) { 
                    apilar(op);
    
    
        }
            else { 
                while(!pilaVacia()){
                            NuevaPos =desapilar(pos);
                                pos = NuevaPos;
                
                }
        } 
            
return pos;
}
    }   
