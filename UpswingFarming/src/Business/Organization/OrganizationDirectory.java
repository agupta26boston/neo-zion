/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Ayushkumar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Buyer.getValue())){
            organization = new BuyerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Seller.getValue())){
            organization = new SellerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Research.getValue())){
            organization = new ResearchOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.EndUser.getValue())){
            organization = new EndUserOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Event.getValue())){
            organization = new EventOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Funding.getValue())){
            organization = new FundingOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}