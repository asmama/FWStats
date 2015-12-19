package my.asufian.openet.utility.property;

/**
 *
 * @author asufian
 */
public enum PropertyError {
    
    ERROR_PROPERTY_FOUND("Property not found."),
    ERROR_PROPERTY_EMPTY("Property has no value."),;

    private PropertyError(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getErrorDesc() {
        return errorDesc;
    }
    
    @Override
    public String toString(){
        return errorDesc;
    }
    
    private final String errorDesc;
    
}
