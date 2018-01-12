/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Data;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class CropMethodDirectory {
    
    private ArrayList<CropMethod> cropMethodList;

    public CropMethodDirectory() {
        this.cropMethodList = new ArrayList<CropMethod>();
    }

    public ArrayList<CropMethod> getCropMethodList() {
        return cropMethodList;
    }

    public void setCropMethodList(ArrayList<CropMethod> cropMethodList) {
        this.cropMethodList = cropMethodList;
    }
    
    public CropMethod addCropMethod(){
        CropMethod cropMethod = new CropMethod();
        cropMethodList.add(cropMethod);
        return cropMethod;
    }
    
    
    
}
