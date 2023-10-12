public class Ejercisio18 {
    public static void main(String[] args) {
        /*Invertir un número: Implementa una función
         que tome un número como entrada y devuelva el número
        con sus dígitos en orden inverso */

        numeroInverso(123245);
        numeroInverso(65789);
        numeroInverso(123322);
        
        
    }

    public static void numeroInverso(int numero){
        String inverso = "";

       

            

            while (numero != 0) {
         
                 int digito = numero % 10;

                inverso += ""+digito+"";
        
                    numero /= 10;
                }

            System.out.println(inverso);

    }
}
