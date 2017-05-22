package com.amenai;

/**
 * Created by amenai on 5/14/17.
 */
public class CommonPerformanceElement {
    private int oatC=15;
    private int weightLb=0;
    private boolean gearDown=true;
    private int flapsSetting=25;
    private int tasKts=0;
    private int altitudeFt=0;
    private int axisWindKts=0;
    void setOatC(int oat){
        oatC=oat;
    }
    int getOATC(){
        return oatC;
    }
    void setWeightLb(int weight){
        if(weight > 0) {
            weightLb = weight;
        }
        //TODO raise an exception otherwize
    }
    int getWeightLb(){
        return weightLb;
    }
    void setGearDown(boolean gear){
        gearDown=true;
    }
    boolean getGearDown(){
        return gearDown;
    }
    void setFlapsSetting(int flaps){
        if(flaps > 25){
            flapsSetting=flaps;
        }
        //TODO raise an exception otherwize
    }
    int getFlapsSetting(){
        return flapsSetting;
    }
    void setTasKts(int tas){
        if(tas > 0){
            tasKts=tas;
        }
        //TODO raise an exception otherwize
    }
    int getTasKts(){
        return tasKts;
    }
    void setAltitudeFt(int alt){
        if (alt > -2000 && alt < 60000){
            altitudeFt=alt;
        }
        //TODO raise an exception otherwize
    }
    int getAltitudeFt(){
        return altitudeFt;
    }
    void setAxisWindKts(int wind){
        axisWindKts=wind;
    }
    int getAxisWindKts(){
        return axisWindKts;
    }
    int calculateDensityAltitude(int pressAltitudeFt){
        int isaTemp=15-2*(pressAltitudeFt/2000);
        int densityAltitude=pressAltitudeFt+120*(oatC-isaTemp);
        return densityAltitude;
    }
}
