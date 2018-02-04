/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class AgricultureEnterprise extends Enterprise{

  
    public AgricultureEnterprise() {
        super(null,null);
    }
    
    public AgricultureEnterprise(String name) {
        super(name, EnterpriseType.Agriculture);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
