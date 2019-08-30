/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMDao;

import VMDto.VMItem;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MARIA
 */
public class VMDaoFileImpl implements VMDao {
   //string id 
   private Map <String, VMItem> machine = new Hashmap <>();
   
    

    @Override
    public VMItem selectItem(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VMItem updateItem(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VMItem> allVendingItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
