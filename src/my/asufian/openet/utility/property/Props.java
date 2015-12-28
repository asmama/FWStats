package my.asufian.openet.utility.property;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import my.asufian.openet.utility.Constants;

/**
 * Based on Factory Pattern and Singleton.
 *
 * @author asufian
 */
public class Props implements Property, Constants {

    private final static Properties props = new Properties();
    final Logger logger = LoggerFactory.getLogger(Props.class);

    private Props() {
    }

    public Props(String fileName) {
        try {
            FileInputStream fs = new FileInputStream(fileName);
            props.load(fs);
        } catch (Exception e) {
            System.err.println(e.fillInStackTrace().toString());
        }
    }

    /**
     * Return value from property file.
     *
     * @param key to search
     * @return value if found, blank otherwise
     */
    @Override
    public String getValue(String key) {
        try {
            if (props.getProperty(key).isEmpty()) {
                logger.warn("KEY=[" + key + "]" + COLON + PropertyError.ERROR_PROPERTY_EMPTY.getErrorDesc());
            }
        } catch (Exception e) {
            logger.warn("KEY=[" + key + "]" + COLON + PropertyError.ERROR_PROPERTY_FOUND.getErrorDesc());
        }

        return props.getProperty(key);
    }
    
    /**
     * Helper method to list all available properties pairs.
     */
    @Override
    public void listAllProperties() {
        Set<Object> keys = props.keySet();
        keys.stream().forEach((key) -> {
            logger.debug("key={" + key + "};value=[" + props.getProperty(key.toString()) + "]");
        });
    }
}
