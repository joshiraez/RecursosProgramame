
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProgramamePlantilla {

    public static void main(String[] args) {
        try{
            
            //Para trabajar.
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String linea = "";
            String[] split; // linea.split(" "); 
            int numCasos=0;
            
            
            //Cogemos primera linea.
            linea= in.readLine();
            
            //Posibles formas de meter datos.
			//Borramos aquellas que no sean la del problema actual.
			
			//Fin = cadena fija de final. Ej: 0 0, FIN
            while(!linea.equals("/**Cadena finalizadora**/")){
                //Hacer cosas con linea.
                System.out.println(linea);
                linea=in.readLine();
            }

			//Hasta fin de flujo.
            while(linea!=null){
                //Hacer cosas con linea
                 System.out.println(linea);
                linea=in.readLine();
            }

			//Primera linea indica numero de casos totales de la prueba.
			numCasos = Integer.parseInt(linea);
            for (int i = 1; i <= numCasos; i++) {
                linea=in.readLine();
                
                //hacemos cosas
                
                System.out.println(linea);
            }

            //Fin programa.
        }catch(IOException exc){
            //:(
        }
    }
    
   
}

/**Dejar el codigo descomentado es bastante mas rapido ya que es solo seleccionar
una seccion grande que pequeños delimitadores de comentado.
**/

/**
	EJEMPLO DE PROBLEMA

 * Mientras haya linea
 *  Lees linea
 *  Operas con linea
 *  Sacas linea
 *
 * 
 * ENTRADA
 * 20 30 40 50 60
 * 10 
 * 2300
 * 
 * SALIDA
 * 2 3 4 5 6
 * 1
 * 23
 * 
 *     public static int cifras(long num){
        int i=1;
        while (num >= Math.pow(10, i)){
            i++;
        }
        return i;
    }
 * 
 */