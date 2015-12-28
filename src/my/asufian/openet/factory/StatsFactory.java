package my.asufian.openet.factory;

import my.asufian.openet.report.Count;
import my.asufian.openet.report.Performance;
import my.asufian.openet.report.Stats;
import my.asufian.openet.report.ReportType;

/**
 *
 * @author asufian
 */
public class StatsFactory extends AbstractFactory {

    @Override
    public Stats getStats(ReportType reportType) {
        switch (reportType) {
            case PERFORMANCE:
                return new Performance();
            case COUNT:
                return new Count();
            default:
                return null;
        }
    }

}
