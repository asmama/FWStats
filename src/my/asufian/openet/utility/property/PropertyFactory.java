package my.asufian.openet.utility.property;

/**
 *
 * @author asufian
 */
public class PropertyFactory {
    
    public static Property getProperty(String statSproperties) {
        return new Props(statSproperties);
    }
}
