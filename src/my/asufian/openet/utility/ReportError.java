/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.asufian.openet.utility;

/**
 *
 * @author asufian
 */
public enum ReportError {
    
    ERROR_ARGUMENT(1001,"Invalid number of arguments"),
    ERROR_SEPARATOR(1002,"Invalid separator given");

    private ReportError(int errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }
      
    @Override
    public String toString(){
        return errorDesc;
    }
    
    private final int errorCode;
    private final String errorDesc;
    
}
