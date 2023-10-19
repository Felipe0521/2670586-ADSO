public class Ejemplo01 {

    public static void main(String[] args) {
        System.out.println("-----Probando Funciones----");
        
        int arreglo[] = new int[10];
         imprimirArreglo(arreglo);
        arreglo = llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        arreglo = restableceArreglo(arreglo);
        imprimirArregloTexto(arreglo);
        /* 
        System.out.println(" Suma = "+ sumar(5, 4));
        System.out.println(" Suma = "+ sumar(3, 2));
        System.out.println(" Suma = "+ sumar(-5, 41));
        System.out.println(" Suma = "+ sumar(5, -4));

        int juanito = sumar(4, 4);
        System.out.println(" juanito = "+ juanito);

        System.out.println("-----Probando Funciones----");
         System.out.println(" dividir = "+ division(5, 4));
        System.out.println(" dividir = "+ division(3, 2));
        System.out.println(" dividir = "+ division(-5, 41));
        System.out.println(" dividir = "+ division(5, -4));

        saludar();
        saludarEnBucle(5);
        imprimirTabla(4, 20);
        */
    }    
    public static int sumar(int a, int b){
        int resultado = (a + b);
        
            return resultado;
    }

     public static float division(float a, float b){
        float resultado = (a / b);
        
            return resultado;
    }

    public static void saludar(){
        System.out.println("---------------------");
        System.out.println("-       HOLA MUNDO  -");
        System.out.println("---------------------");
    }

     public static void saludarEnBucle(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("---------------------");
        System.out.println("-    HOLA MUNDO"+i+"  -");
        System.out.println("---------------------");
        }
        
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for (int i = 0; i <= multiplo; i++) {
            
        System.out.println(tabla+" x "+i+" = "+tabla*i);
        
        }
    }

    public static void imprimirArreglo(int [] arreglo ){
        for (int i = 0; i < arreglo.length; i++) {
             System.out.println("["+arreglo[i]+"]");
        }
    }

    public static int[] llenarArreglo(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random()*100);

            arreglo[i] = aleatorio;
        }

        return arreglo;
    }

    public static String[] restableceArreglo(String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = "Ninguno";
        }

        return arreglo;
    }

     public static void imprimirArregloTexto(String [] arreglo ){
        for (int i = 0; i < arreglo.length; i++) {
             System.out.println("["+arreglo[i]+"]");
        }
        
    }
}
