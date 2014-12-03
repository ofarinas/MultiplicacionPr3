package mul;

import java.math.BigInteger;

public class MultiplicaPorSumaSucesiva {

    public static BigInteger multiplica(BigInteger factor1 , BigInteger factor2 ){
        
        BigInteger cero = new BigInteger("0");
        BigInteger uno = new BigInteger("1");
        if(factor1.equals(cero) || factor2.equals(cero) )  return cero;
        if(factor1.equals(uno)) return factor2;
        else return factor2.add(multiplica(factor1.subtract(uno) , factor2));
        
    }
    
    
}
