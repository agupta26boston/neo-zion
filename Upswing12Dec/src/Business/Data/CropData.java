/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Data;

/**
 *
 * @author Mayank
 */
public class CropData {
    
    
    private String stateName;
    private String city;
    private String season;
    private String crop1;
    private String crop2;
    private String crop3;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCrop1() {
        return crop1;
    }

    public void setCrop1(String crop1) {
        this.crop1 = crop1;
    }

    public String getCrop2() {
        return crop2;
    }

    public void setCrop2(String crop2) {
        this.crop2 = crop2;
    }

    public String getCrop3() {
        return crop3;
    }

    public void setCrop3(String crop3) {
        this.crop3 = crop3;
    }
    
    @Override
    public String toString(){
        return season;
    }
    
}
