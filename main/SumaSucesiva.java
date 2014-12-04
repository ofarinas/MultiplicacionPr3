package main;
import java.math.BigInteger;

public class SumaSucesiva {

     public static BigInteger multiplica (BigInteger factor1, BigInteger factor2)
     {
         if(factor1.equals(BigInteger.ZERO) || factor2.equals(BigInteger.ZERO))
                return BigInteger.ZERO;
         else if(factor1.equals(BigInteger.ONE))
             return factor2;
         else
             return factor2.add(multiplica(factor1.subtract(BigInteger.ONE), factor2));
     }
}
