
package boletin_14;


public class Boletin_14 {

 
    public static void main(String[] args) {
      
    ConversorTemperaturas obx = new ConversorTemperaturas();
        
        try{
    System.out.println("A cantidade convertida a reamurs e "+obx.centigradosAreamur(150));
    System.out.println(" A cantidade convertida a farenheit e "+obx.centigradosaFarenheit(70));    
    }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
    }
    
}
}