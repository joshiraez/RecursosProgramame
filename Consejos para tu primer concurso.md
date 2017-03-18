# Consejos para tu primer concurso
* 0) **Vamos para divertirnos** y aprender lo que es trabajar en un ambiente de estres con un equipo multi-talento. Puedes aprender Organizacion orientada a objetivos,
Gestion del tiempo, Analisis a priori de programas, Velocidad de Programacion y afianzar el uso de estructuras y metodologias.

* 1) Coge la plantilla, leela y comprendela. Es recomendable que la leas junto a la guia del concurso de Programame para que puedas ir 
relacionando tipos de entrada, forma de entrada, etc. 
* 2) Prueba el [problema 116] (https://www.aceptaelreto.com/problem/statement.php?id=116)  en Acepta el reto usando la plantilla.
* 3) Prueba haciendo mas problemas de Acepta el reto. Es recomendable hacerlo por categorias y tocar un poco de todas.
  * 3.1) Empieza con categorias sencillas, como [Construcciones de programacion] (https://www.aceptaelreto.com/problems/categories.php/?cat=3) -> Condicionales o Expresiones.
  * 3.2) Toca un poco de cada tipo. En un concurso es normal que encuentres varios problemas con 1 o 2 por tipo de problema.
  * 3.3) Dias anteriores al concurso empieza a probar hacer lo de las categorias concurso. Coge un concurso antiguo, y empieza a hacerlos. Cronometrate.
  * 3.4) Recuerda hacer todo lo que puedas en equipo. No tiene nada que ver con hacerlo solo. Dominar la comunicacion con tu equipo y el reparto de tareas es primordial.
* 4) Es muy normal que aun con la plantilla tengas diversos problemas. Lo mas critico es **coger experiencia** haciendo problemas en
    acepta el reto para conocer que causas son mas probables que te den errores. Una relacion la tienes aqui pero aprenderas mas
    segun te enfrentes a ellos y los arregles.
    * 4.1) ** Mucho ojo con los tipos de dato **
      * Usa int y float siempre que la memoria no sea un problema. No hace falta byte o shorts.
      * Lo mismo con los objetos (no te hace falta StringBuffer, te vale String). 
      * En todo caso lee muy bien el tamaño de los datos de entrada. Hay problemas hechos para que un numero no te quepa en un long, o una linea de texto en un string.
      * El flujo de entrada en Java DEBE SER un BufferedReader, *NUNCA UN SCANNER*. Te dará TLE. [Mas info] (http://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader)
    * 4.2) CE - * Compilation Error * - Si sigues la plantilla y te aseguras que el nombre de la clase es el mismo que el archivo, cualquier CE posible son los mismos errores que te dara tu entorno de desarrollo.
    * 4.3) RTE - * Run-Time Error * - Pesadilla 1: PUede ser por MIL Causas. La experiencia practicando en Acepta el reto te ayudará a afrontarlos.
      * Comprueba que el algoritmo este bien y los bucles se recorran correctamente debugeando la aplicacion.
      * Otras causas: Algunas las puedes encontrar en el apartado de tipos de datos. Una gran parte son por estas causas.
      * Nunca van a ser por datos "erroneos". Ejemplo: no te van a poner un triangulo con lados negativos.
      * Pero es muy probable que sean * casos límite *. Ejemplo: Te pueden pasar una matriz de 1x1, o meterte cadenas de caracteres vacias o con solo un carácter, pese a no tener sentido.
      * Tomate un respiro. Ggeneralmente entra dentro de tipo de dato o que sea un caso limite. Si no encuentras el error, dale un segundo al problema y piensa que casos podrias meter para forzar a la maquina a dar un Error en ejecucion.
    * 4.4) TLE - * Time-Limit Error * - Pesadilla 2: Puede ser por MIL causas y la experiencia es lo que mas te ayudara. * Haz problemas *
      * Comprueba que los flujos esten cerrados y los bucles salgan (p.e. que no confundas iteradores). A veces se puede enmascarar de CE.
      * ¡¡¡¡Comprueba que no usas Scanner!!!!
      * También puede ser problemas de algoritmo. 
        * Si tienes que hacer un conteo ciclico, en vez de usar un bucle, usa el operador modulo (%) 
        * Si tienes que recorrer una matriz, muchas veces son algoritmos de fuerza bruta.
          * ¿Recursividad podria ayudar?
          * ¿Hay algun caso en el que me ahorre tener que investigar una zona?
          * Hay alguna manera de evitar repetir calculos. -> Crear matrices intermedias.
        * ¿Hay alguna formula matemática que me de el resutado?
        * Usar otro método de ordenacion, como QuickSort, en vez de lineal o burbuja.
        * Tomate un respiro. Desconecta del problema, crea un nuevo Java e intenta hacerlo desde 0, a ver si puedes encontrar otra aproximacion.
    * 4.5) WA - * Wrong Answer * 
        * Comprueba que el espaciado, máyusculas y minúsculas, b y v, m y n. Generalmente son problemas de formato u ortografía.
        * Pueden ser un RTE enmascarado que sin embargo no ha explotado y ha ido por un camino no previsto. Revisa el algoritmo.
          * Refactorizar y ordenar el algoritmo ayuda enormemente.
  * 5) ** LLEGA EL DÍA DEL CONCURSO **
    * Duerme bien el dia anterior y alimentate bien durante todo el dia. Evita las bebidas energéticas y, como mucho, tomalas durante el concurso.
    * Todo el mundo nos ponemos nerviosos. Antes de empezar, haz algún ejercicio de relajacion si eres especialmente propenso a los nervios.
    * Cuando te den los enunciados, leelos todos con una lectura rápida. Localiza los más faciles, repartelos y hazlos tan pronto como sea posible.
      * La forma de puntuar de Programame beneficia extremadamente los envios rapidos. Intenta enviar los mas faciles lo mas rapido posible.
      * Aún así, prueba el programa como mínimo con los casos que te salga en el enunciado. Puedes tener un error muy tonto y la penalizacion por fallo de envio son 20 minutos.
      * Ten a todo el equipo trabajando siempre en el algoritmo de un problema. Según lo vayas terminando ve cogiendolos por orden de complejidad. No te dan premios por hacer uno mas díficil.
      * Según vaya acabando el tiempo, empieza a concentrarte en resolverlos y deja que el juez decida si falta algún caso límite o no.
        ** Las penalizciones solo cuentan para problemas resueltos, y el numero de problemas resueltos tiene mas prioridad que el tiempo de penalizacion.
    * Tomate pequeños descansos, especialmente en los presenciales y el nacional:4 horas es MUCHO tiempo de estres continuo, y desconectar te refrescará como afrontas los problemas.    
    
    
    ** Y RECUERDA: PASALO BIEN **
