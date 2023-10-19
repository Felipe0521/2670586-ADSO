public class Principal2 {
    public static void main(String[] args) {
        CajeroElectronico cajero02 = new CajeroElectronico(100000000, "BANCOLOMBIA", "123", "123S");
        cajero02.abastecerCajero(1,1,2,1);
        cajero02.imprimirDetalle();
        TarjetaDebito tarjeta01 = new TarjetaDebito("Pipe", "1234 980 345 345", "Davivienda", 0, 15000000, "8901","ACTIVA");
        tarjeta01.verHistorial("334");
        tarjeta01.verHistorial("8901");
        tarjeta01.verHistorial("9980");

        cajero02.consignarDineroaTarjeta(tarjeta01, 0, 0, 0, 1, "8901");
        cajero02.imprimirDetalle();
    }
    
}