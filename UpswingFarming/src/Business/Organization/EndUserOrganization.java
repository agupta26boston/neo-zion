/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NewUserRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ayushkumar
 */
public class EndUserOrganization extends Organization{
    
    public EndUserOrganization() {
        super(Organization.Type.EndUser.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NewUserRole());
        return roles;
    }
}
