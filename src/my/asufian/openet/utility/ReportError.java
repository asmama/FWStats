package my.asufian.openet.utility;

/**
 *
 * @author asufian
 */
public enum ReportError {
    
    ERROR_ARGUMENT(1001,"Invalid number of arguments"),
    ERROR_FOLDER(1002,"Invalid folder specified"),
    ERROR_SEPARATOR(1003,"Invalid separator given"),
    ERROR_REPORTTYPE(1004,"Invalid reportType specified");

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
