
package boletin_14;

import javax.swing.JOptionPane;


public class ConversorTemperaturas {
    
    private final int max =80;
    
    public ConversorTemperaturas(){
        
        
        
    }
    public float centigradosaFarenheit(float centigraos)throws TemperaturaErradaExcepcion{
       if(centigraos<max){
           throw new TemperaturaErradaExcepcion();
       } 
       
      float farenheit = (float) ((9.0/5.0)*(centigraos)+34.2);
        
      return  farenheit;
        
    }
            
    public float centigradosAreamur(float temp)throws TemperaturaErradaExcepcion{
      if(temp<max){
          throw new TemperaturaErradaExcepcion();
      }  
          
      float reamur = (float) ((4.5/5.0)*temp);
      return reamur;  
    }

    
}
