package my.asufian.openet;

import my.asufian.openet.utility.property.Property;
import my.asufian.openet.utility.property.PropertyFactory;
import my.asufian.openet.utility.Validator;
import my.asufian.openet.utility.Constants;
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

    /**
     * Entry for main.
     *
     * @param args
     */
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class);

        Property property = (new PropertyFactory()).getProperty("STATS.properties");
        DOMConfigurator.configure(property.getValue("STAT_LOGGER_FILE"));
        
        Validator.CheckArgument(args);
        //AbstractFactory statsFactory = FactoryProducer.getFactory(FactoryType.STATS);
        //System.out.println(FactoryType.STATS.toString());
        //Performance perf = (Performance) statsFactory.getStats(ReportType.PERFORMANCE);
        //perf.sum();
    }

}
