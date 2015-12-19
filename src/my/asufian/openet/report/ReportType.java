/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.asufian.openet.report;

/**
 *
 * @author asufian
 */
public enum ReportType {
    
    PERFORMANCE("performance"), COUNT("count");
   
    private ReportType(String type){
        this.type=type;
    }
    
    private final String type;
    
    @Override
    public String toString(){
        return type;
    }
    
}
