package my.asufian.openet.utility;

import java.util.HashSet;
import my.asufian.openet.report.StatsReport;


/**
 *
 * @author asufian
 */
public class Util implements Constants {

    /**
     * provide list of the searched report.
     * @param args
     * @return HashSet which might be empty.
     */
    public static HashSet<StatsReport> ProduceReportSet(String args) {

        HashSet<StatsReport> reportSet = new HashSet<>();
        String[] totalStats = args.split(String.valueOf(COMMA));
        for (String stat : totalStats) {
            if (!stat.contains(String.valueOf(COLON))) {
                System.err.println(Validator.CorrectArgument());
                System.exit(ReportError.ERROR_ARGUMENT.getErrorCode());
            }
        }

//        String[] splitStat = totalStats.(String.valueOf(COLON), TWO);
//        for (ReportType reportType : ReportType.values()) {
//            if (splitStat[0].equals(reportType.toString())) {
//                StatsReport st = new StatsReport();
//                reportSet.add(st);
//            }
//        }
        return reportSet;
    }

}
