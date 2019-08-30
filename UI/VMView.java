/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import VMDto.VMItem;


public class VMView {
    private UserIO io;
    
    public VMView(UserIO io){
        this.io=io;
    }
    
    //prints         
       public void vendingScreen(){
        io.print(VMItem.getID);
        io.print(VMItem.getName);
        io.print(VMItem.getQuantityInStock);
        io.print(VMItem.getCost);
        
    }
    
    public double 
}
