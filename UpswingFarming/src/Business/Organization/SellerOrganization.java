/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SellerRole;
import java.util.ArrayList;

/**
 *
 * @author Ayushkumar
 */
public class SellerOrganization extends Organization{
    
    public SellerOrganization() {
        super(Organization.Type.Seller.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SellerRole());
        return roles;
    }

    
    
}
