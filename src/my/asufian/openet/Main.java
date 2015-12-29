package my.asufian.openet;

import my.asufian.openet.factory.AbstractFactory;
import my.asufian.openet.factory.FactoryProducer;
import my.asufian.openet.factory.FactoryType;
import my.asufian.openet.report.Performance;
import my.asufian.openet.report.ReportGenerator;
import my.asufian.openet.report.ReportType;
import my.asufian.openet.utility.Constants;
import my.asufian.openet.utility.Validator;
import my.asufian.openet.utility.property.Property;
import my.asufian.openet.utility.property.PropertyFactory;
import my.asufian.openet.utility.property.Props;
import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry.
 *
 * @author asufian
 */
public class Main implements Constants {

    final static String propertyFile = "STATS.properties";

    public static String getPropertyFile() {
        return propertyFile;
    }
    final static String propertyValue = "STAT_LOGGER_FILE";
    
    /**
     * Entry for main.
     *
     * @param args
     */
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class);

        DOMConfigurator.configure(PropertyFactory.getProperty
            (propertyFile).getValue(propertyValue));
        Validator.CheckArgument(args);
        //ReportGenerator.produce(args);
    }

}
