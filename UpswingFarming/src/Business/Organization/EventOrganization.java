/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventOrganizerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class EventOrganization extends Organization{

    public EventOrganization() {
        super(Type.Event.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EventOrganizerRole());
        return roles;
    }
    
    
}
