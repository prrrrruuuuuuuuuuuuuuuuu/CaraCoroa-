 import java.util.Random;
 
 public class caracoroa {
    public static void main(String[] args)
    {
        Random gerador = new Random(); // gera números aleatórios
        boolean sorteio = gerador.nextBoolean(); // apresenta 2 valores, true ou false 
             
        if(sorteio == true) {
          System.out.printf("cara"); 
        } else {
          System.out.printf("coroa"); 
     }
   }
 }