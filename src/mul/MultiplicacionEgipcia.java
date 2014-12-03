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
public class MultiplicacionEgipcia {
    
    public BigInteger multiplicacionEgipcia(BigInteger bigInteger1 ,BigInteger bigInteger2 ){
       Producto producto=  multiplicaEgipcia(bigInteger1,bigInteger2,1); 
       return producto.getBigInteger();
    }

    private Producto multiplicaEgipcia(BigInteger bigInteger1, BigInteger bigInteger2, int double1) {
         if(double1>bigInteger2.doubleValue()) {
             return new Producto(new BigInteger("0"), new BigInteger("0"));
         }if(double1<=bigInteger2){
       Producto mul=   multiplicaEgipcia(bigInteger1, bigInteger2, 2*double1);
        if (mul.getBigInteger2().doubleValue()+double1) 
         return new Producto(mul.getBigInteger(). );
            }
    return null;
    }
}

/*
función multiplicaEgipcia (entero n, entero m, entero doble1) devuelve (entero p, entero s)
si doble1 > m entonces devolver (0,0) fin si
si doble1 ≤ m entonces
     (p’, s’) ← multiplicaEgipcia(n, m, 2*doble1) 
      si s’ + doble1 ≤ m entonces
           devolver (p’+n*doble1, s’+doble1)
      si no
           devolver (p’, s’)
      fin si
fin si
fin funció*/