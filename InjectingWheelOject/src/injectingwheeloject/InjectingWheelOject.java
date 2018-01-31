/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package injectingwheeloject;

/**
 *
 * @author la354338
 */
public class InjectingWheelOject {
 Wheel wh;

    public Wheel getWh() {
        return wh;
    }

    public void setWh(Wheel wh) {
        this.wh = wh;
    }
  
    public InjectingWheelOject(Wheel wh) {
        this.wh = wh;
       wh.setVolume(23);
       System.out.println(wh.getVolume());
    }
    
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wheel wh1 = new Wheel();
        InjectingWheelOject ob = new InjectingWheelOject(wh1);
        
    }
    
}
