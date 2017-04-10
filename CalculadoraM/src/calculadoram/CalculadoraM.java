
package calculadoram;

public class CalculadoraM {
    float x,y,resultado;
    
    

    public CalculadoraM() {
    this.x = 0;
    this.y = 0;
    this.resultado = 0;
    }
    
    public void Somar(){
        resultado = x+y;
    }
    public void Subtrair(){
        resultado = x-y;
    }
    public void Dividir(){
        resultado = x/y;
    }
    public void Multiplicar(){
        resultado = x*y;
    }

  
    
}
