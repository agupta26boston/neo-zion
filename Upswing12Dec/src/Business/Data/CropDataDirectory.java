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
public class CropDataDirectory {
    
    private ArrayList<CropData> cropDataList;

    public CropDataDirectory() {
        this.cropDataList = new ArrayList<CropData>();
    }

    public ArrayList<CropData> getCropDataList() {
        return cropDataList;
    }

    public void setCropDataList(ArrayList<CropData> cropDataList) {
        this.cropDataList = cropDataList;
    }
    
    
    public CropData addCropData(){
        CropData cropData = new CropData();
        cropDataList.add(cropData);
        return cropData;
    }
    
    
    
}
