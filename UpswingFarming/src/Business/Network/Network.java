/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Network{
    
    private String name;
    private ArrayList<SubNetwork> subNet;

    public Network() {
       
        subNet = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SubNetwork> getSubNet() {
        return subNet;
    }

    public void setSubNet(ArrayList<SubNetwork> subNet) {
        this.subNet = subNet;
    }

    

    public SubNetwork createAndAddsubNetwork() {
        SubNetwork subn = new SubNetwork();
        subNet.add(subn);
        return subn;
    }

    @Override
    public String toString() {
        return name;
    }

   
}
