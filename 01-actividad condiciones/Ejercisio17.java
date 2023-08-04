    import java.util.Scanner;
    public class Ejercisio17 {
       public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el valor en cop: ");
        double copvalor = entrada.nextDouble();

        double usdvalor = copvalor / 3900;
        double eurvalor = copvalor / 4200;
        double jpyvalor = copvalor / 0.0002;
        double gbpvalor = copvalor / 4500;

        System.out.println("el valor en EUR es " + eurvalor);
        System.out.println("el valor en USD es " + usdvalor);
        System.out.println("el valor en JPY es " + jpyvalor);
        System.out.println("el valor en GBP es " + gbpvalor);
        
    }
}
