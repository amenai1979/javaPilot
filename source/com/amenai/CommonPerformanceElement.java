package com.amenai;

/**
 * Created by amenai on 5/14/17.
 */
public class CommonPerformanceElement {
    int oatC=15;
    int weightLb=2450;
    boolean gearDown=true;
    int flapsSetting=25;
    int tasKts=130;
    int altitudeFt=132;
    int axisWindKts=0;
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

    //constructors
    CommonPerformanceElement(){
        //just takes the defaults
    }
    CommonPerformanceElement(int oat, int weight, int tas, int altitude, int axisWind){
        try {
            setAltitudeFt(altitude);
            setAxisWindKts(axisWind);
            setOatC(oat);
            setTasKts(tas);
            setWeightLb(weightLb);
        }
        catch (Exception exception){
            //log the error
            //call the default construtor
            //CommonPerformanceElement();
            System.out.println("unable to initiate CommonPerformanceElement instance with parameters");
            System.out.println("initializing with defaults");
        }

    }


    int calculateDensityAltitude(int pressAltitudeFt){
        //calculates the desnity altitude based on the pressure altitude
        //this method presumes that isaTemp is in degrees celcius.
        //for non aviators: the stanrd temperature lapse rate is -2 degrees celcius every 1000 feet of height.
        //the standard temperature at sea level is 15 degrees celcius.
        int isaTemp=15-2*(pressAltitudeFt/2000);
        int densityAltitude=pressAltitudeFt+120*(oatC-isaTemp);
        return densityAltitude;
    }
}
