
package principalinfijapos;

public class NodoInfija {
  String expresion;
  NodoInfija siguiente;  
  
  public NodoInfija (String exp, NodoInfija n){
      expresion = exp;
      siguiente = n;
  }
}
