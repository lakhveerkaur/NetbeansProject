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
public class Wheel {
    int size;
    int volume;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   public static void main(String[] args) {
        // TODO code application logic here
        Wheel frontWheet=new Wheel();
        frontWheet.setSize(40);
        frontWheet.setVolume(45);
        
    }
    
}
