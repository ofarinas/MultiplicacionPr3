package main;
import java.math.BigInteger;

public class MultiplicacionRusa {

    public static  BigInteger multiplica(BigInteger a, BigInteger b) {
        if (a.intValue() == 1) {
            return b;
        }
        if (a.mod(new BigInteger("2")).intValue() == 1) {
            return b.add(multiplica(a.divide(new BigInteger("2")), b.multiply(new BigInteger("2"))));
        } else {
            return multiplica(a.divide(new BigInteger("2")), b.multiply(new BigInteger("2")));
        }
    }
}
