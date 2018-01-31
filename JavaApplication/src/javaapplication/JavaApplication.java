/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

/**
 *
 * @author la354338
 */
public class JavaApplication {
// injection with constructor
    Pojo po;
    public JavaApplication(Pojo po) {
        
        this.po=po;
        System.out.println(po.getEmpid()+"in constructor");
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Pojo po = new Pojo();
        
        po.setEmpid("la354338");
        System.out.println(po.getEmpid());
        JavaApplication ob = new JavaApplication(po);
    }
    
}
