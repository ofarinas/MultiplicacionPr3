import java.math.BigInteger;

public class MultiplicacionRusa {

    public BigInteger multiplicacionRusa(BigInteger a, BigInteger b) {
        if (a.intValue() == 1) {
            return b;
        }
        if (a.mod(new BigInteger("2")).intValue() == 1) {
            return b.add(multiplicacionRusa(a.divide(new BigInteger("2")), b.multiply(new BigInteger("2"))));
        }else{
            return multiplicacionRusa(a.divide(new BigInteger("2")), b.multiply(new BigInteger("2")));
        }
    }
}
