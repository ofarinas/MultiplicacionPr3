package mul;

import java.math.BigInteger;

public class Mul {

    public static void main(String[] args) {
       
        DatoTiempo dato = new DatoTiempo();
        BigInteger tresMil = new BigInteger("8000");
        BigInteger cuatroMil = new BigInteger("4000");
        
        dato.start();
        BigInteger resultado = MultiplicaPorSumaSucesiva.multiplica(tresMil,cuatroMil);
        dato.stop();
        
        System.out.println(dato.dameTiempoEnSegundos());
        
    }

}
