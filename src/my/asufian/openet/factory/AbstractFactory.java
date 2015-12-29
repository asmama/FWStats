package my.asufian.openet.factory;

import my.asufian.openet.report.Stats;
import my.asufian.openet.report.ReportType;

/**
 *
 * @author asufian
 */
public abstract class AbstractFactory {
    public abstract Stats getStats(ReportType reportType);
}
