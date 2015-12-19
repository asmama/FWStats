package my.asufian.openet.utility.property;

import my.asufian.openet.utility.property.Property;
import my.asufian.openet.utility.property.Props;

/**
 *
 * @author asufian
 */
public class PropertyFactory {
    
    public Property getProperty(String statSproperties) {
        return new Props(statSproperties);
    }
}
