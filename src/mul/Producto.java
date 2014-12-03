/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul;

import java.math.BigInteger;

/**
 *
 * @author usuario
 */
public class Producto {
   private BigInteger bigInteger ;   
   private BigInteger bigInteger2 ;

    public Producto(BigInteger bigInteger, BigInteger bigInteger2) {
        this.bigInteger = bigInteger;
        this.bigInteger2 = bigInteger2;
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public BigInteger getBigInteger2() {
        return bigInteger2;
    }

    public void setBigInteger2(BigInteger bigInteger2) {
        this.bigInteger2 = bigInteger2;
    }
    
}
