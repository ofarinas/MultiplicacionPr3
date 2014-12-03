package mul;

import java.math.BigInteger;

public class Mul {

    public static void main(String[] args) {
        MultiplicacionEgipcia egipcia =new MultiplicacionEgipcia();
         System.out.println(egipcia.multiplicacionEgipcia(new BigInteger("2"), new BigInteger("2")).doubleValue()); 
         System.out.println(egipcia.multiplicacionEgipcia(new BigInteger("44"), new BigInteger("10")).doubleValue()); 
         
         
    }

}
