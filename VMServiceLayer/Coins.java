
package VMServiceLayer;

import java.math.BigDecimal;



public class Coins {
   
    enum Coin {
     QUARTER (new BigDecimal("0.25")),
     DIME (new BigDecimal("0.10")),
     NICKEL(new BigDecimal ("0.05")),
     PENNY (new BigDecimal ("0.01"));
             
    
}
}
