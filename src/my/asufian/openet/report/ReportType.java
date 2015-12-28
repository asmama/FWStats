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
