package my.asufian.openet.report;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author asufian
 */
public class StatsReport {

    private String name;
    private ReportType reportType;
    private ArrayList<Stats> stats;

    public StatsReport(String name, ReportType reportType) {
        this.name = name;
        this.reportType = reportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public ArrayList<Stats> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stats> stats) {
        this.stats = stats;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
