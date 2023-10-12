public class Ejercisio23 {
    public static void main(String[] args) {
        interesCompuesto(1000000, 2, 12);
    }
    public static void interesCompuesto(float monto, float tasaInteres, int periodoMeses){
        tasaInteres = 1+(tasaInteres /100);
        float interes = (float) Math.pow(tasaInteres, periodoMeses);
        float montoFinal = monto*(interes);

        System.out.println("El monto final de un credito de"+monto+" con tasa de interes de "+tasaInteres+"% y un perido de "+periodoMeses+" meses es: "+montoFinal);
    }
}
