
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TratarDatosString {
    public static void main(String[] args) throws IOException{
        //Para leer datos de un string en java podemos usar String split y StringTokenizer
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime, endTime;
        
        System.out.println("Deja en blanco para caso por defecto");
        String linea = in.readLine();
        
        if(linea.equals("")){ linea = "hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal hola que tal "; }
        //Split nos crea un array de Strings con los datos separados por el string que pongamos.
        //Ventajas: Un array nos permite recorrerlo y acceder a el cuando queramos. Muy rapido de implementar.
        //Desventajas: MLE si tiene que leer un array demasiado largo. Si te sale MLE, usa StringTokenizer.
        startTime= System.nanoTime();
        
        String[] datos = linea.split(" ");
        
        for (int i=0; i<datos.length; i++){
            System.out.print(datos[i]); //Quitamos ln para facilitar lectura.
        }
        System.out.println("");
        
        endTime=System.nanoTime();
        
        System.out.println("Tiempo split = "+ (endTime-startTime)+"ns");
        
        //StringTokenizer nos crea un iterador sobre las subcadenas separadas por el string que pongamos.
        //Ventajas: Es MUCHO mas rapido de ejecutar, y al ser un iterador no esta creando memoria. 
        //          Usar para evitar MLE y TLE si os da un fallo.
        //Desventajas: Tendremos que guardar los datos si queremos acceder a ellos. Solo los lee una vez 
        //              y en un orden fijo.
        startTime= System.nanoTime();
        
        StringTokenizer st = new StringTokenizer(linea, " ");
        
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()); //Quitamos ln para facilitar lectura
        }
        System.out.println("");
        
        endTime=System.nanoTime();
        
        System.out.println("Tiempo tokenizer = "+ (endTime-startTime)+"ns");
        
        
        //Por ultimo. A la hora de construir Strings, recuerda que tienes StringBuilder para concatenar y trabajr
        //con Strings. Acude a el si tienes un TLE ya que es MUCHISIMO mas rapido.
         startTime= System.nanoTime();
        
        String out = "";
        for(int i=0; i<datos.length; i++){
            out += datos[i]+" ";
        }
        endTime=System.nanoTime();
        
        System.out.println(out);
        System.out.println("Tiempo concatenar normal = "+ (endTime-startTime)+"ns");
        
         startTime= System.nanoTime();
        
        StringBuilder outBuilder = new StringBuilder("");
        for(int i=0; i<datos.length; i++){
            outBuilder.append(datos[i]+" ");
        }
        endTime=System.nanoTime();
        
        System.out.println(outBuilder);
        System.out.println("Tiempo StringBuilder = "+ (endTime-startTime)+"ns");
        
    }
}
