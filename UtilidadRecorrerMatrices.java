
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UtilidadRecorrerMatrices {
    //El metodo que verás aquí es un método que te sirve para recorrer y pintar 
    //todas las celdas "disponibles" de la matriz que te metan por teclado, 
    //empezando desde un punto.
    
    //Esto solo te soluciona el movimiento. Recuerda que dependiendo del problema
    //lo usaras de un modo u otro.
    
     private static final String[] EXAMPLEMAZE= 
            new String[]{
                ".........**.*",
                "...**....*..*",
                "...**....*...",
                ".*..*...***..",
                "*******.***.."
            };
     
    private static void recorrerMapa(int fila, int columna, String[] mapa, char[][] recorrido){
        visitarNodo(fila, columna, mapa, recorrido);
        if(puedeIrArriba(fila, columna, mapa, recorrido)){
            recorrerMapa(fila-1, columna, mapa, recorrido);
        }
        if(puedeIrDerecha(fila, columna, mapa, recorrido)){
            recorrerMapa(fila, columna+1, mapa, recorrido);
        }
        if(puedeIrAbajo(fila, columna, mapa, recorrido)){
            recorrerMapa(fila+1, columna, mapa, recorrido);
        }
        if(puedeIrIzquierda(fila, columna, mapa, recorrido)){
            recorrerMapa(fila, columna-1, mapa, recorrido);
        }
    }
    
    private static void visitarNodo(int fila, int columna, String[] mapa, char[][] recorrido){
        //Aqui haremos la accion que tengamos que hacer. Puede pintarse en el recorrido, 
        //o que sea otra cosa.
        recorrido[fila][columna] = '#';
    }
    
    //Los puede ir indican si se puede ir en esa direccion. Tenemos que mirar que no nos
    //salgamos de la matriz, que no nos choquemos contra "un muro", y que no sea un camino
    //ya visitado con anterioridad.
    private static boolean puedeIrArriba(int fila, int columna, String[] mapa, char[][] recorrido){
        boolean res = true;
        
        //No este en primera fila
        res = res && fila!=0;
        
        //No este bloqueado el camino:
        //Nota: No da excepcion el index ya que si fila fuera 0, res seria falso y ni evaluaria el resto.
        res = res && mapa[fila-1].charAt(columna) != '*';
        
        //No se haya visitado ya:
        //Nota: El valor por defecto de char es 0. Es como un "vacio". En este caso usamos la marca.
        res = res && recorrido[fila-1][columna] != '#';
        
        return res;
    }
    
    //Lo mismo con los otros.
    private static boolean puedeIrDerecha(int fila, int columna, String[] mapa, char[][] recorrido){
        boolean res = true;
        
        res = res && columna!=recorrido[0].length-1;
        
        res = res && mapa[fila].charAt(columna+1) != '*';
        
        res = res && recorrido[fila][columna+1] != '#';
        
        return res;
    }
    
     private static boolean puedeIrAbajo(int fila, int columna, String[] mapa, char[][] recorrido){
        boolean res = true;
        
        res = res && fila!=recorrido.length-1;
        
        res = res && mapa[fila+1].charAt(columna) != '*';
        
        res = res && recorrido[fila+1][columna] != '#';
        
        return res;
    }
     
      private static boolean puedeIrIzquierda(int fila, int columna, String[] mapa, char[][] recorrido){
        boolean res = true;
        
        res = res && columna!=0;
        
        res = res && mapa[fila].charAt(columna-1) != '*';
        
        res = res && recorrido[fila][columna-1] != '#';
        
        return res;
    }
    
    public static void main(String args[]){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0; i<EXAMPLEMAZE.length; i++){
            System.out.println(EXAMPLEMAZE[i]);
        }
        
        System.out.println("");
        System.out.println("¿A que casillas podemos llegar desde 0,0?");
        
        char[][] casillasVisitadas = new char[EXAMPLEMAZE.length][EXAMPLEMAZE[0].length()];
        
        recorrerMapa(0, 0, EXAMPLEMAZE, casillasVisitadas);
        
        System.out.println("Los nodos alcanzables fueron: ");
        for (int i=0; i<EXAMPLEMAZE.length; i++){
            for (int j=0; j<EXAMPLEMAZE[0].length(); j++){
                if(casillasVisitadas[i][j]!=0){
                    System.out.print(casillasVisitadas[i][j]);
                }else{
                    System.out.print(EXAMPLEMAZE[i].charAt(j));
                }
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        System.out.println("¿Y desde 2,11?");
        casillasVisitadas = new char[EXAMPLEMAZE.length][EXAMPLEMAZE[0].length()];
        recorrerMapa(2, 11, EXAMPLEMAZE, casillasVisitadas);
        for (int i=0; i<EXAMPLEMAZE.length; i++){
            for (int j=0; j<EXAMPLEMAZE[0].length(); j++){
                if(casillasVisitadas[i][j]!=0){
                    System.out.print(casillasVisitadas[i][j]);
                }else{
                    System.out.print(EXAMPLEMAZE[i].charAt(j));
                }
            }
            System.out.println("");
        }
        
    }
}
