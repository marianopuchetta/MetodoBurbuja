package metodoburbuja;


/**
 * @author Mariano Puchetta
 */
public class MetodoBurbuja {

    
    public static void main(String[] args) {
        int[]numbers=new int[]{32,12,455,78,9};
        metodoBurbuja(numbers);
    }
    public static void metodoBurbuja(int[]array){
      int n= array.length;
      boolean intercambio;
      
      do{
        intercambio=false;
        for (int i = 1; i < n; i++) {
         //si este par no esta ordenado
         if(array[i-1]>array[i]){
           //los intercambiamos y marcamos que algo ha cambiado
           int aux = array[i-1];
           array[i-1]=array[i];
           array[i]=aux;
           intercambio=true;
         }
        }
        
      }while(intercambio==true);
  
for(int number: array){
    System.out.print(number + " ");
}      
    }
}
