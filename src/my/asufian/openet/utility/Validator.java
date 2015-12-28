package my.asufian.openet.utility;

import java.nio.file.Files;
import java.nio.file.Paths;
import my.asufian.openet.report.ReportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author asufian
 */
public class Validator implements Constants {

    final static Logger logger = LoggerFactory.getLogger(Validator.class);

    /**
     * check whether the argument is correct.
     * @param args - must met the ARGS_REQUIRED.
     */
    public static void CheckArgument(String[] args) {
        if (!(args.length == ARGS_REQUIRED)) {
            Notify(CorrectArgument(), Usage(), ReportError.ERROR_ARGUMENT.getErrorCode());
        }

        if (!(CheckFolder(args[0]))) {
            Notify(CorrectFolder(), Usage(), ReportError.ERROR_FOLDER.getErrorCode());
        }

        if (!(CheckStatsSeparator(args[1]))) {
            Notify(CorrectStatsSeparator(), Usage(), ReportError.ERROR_SEPARATOR.getErrorCode());
        }

        for (String rptType : args[1].split(COMMA.toString())) {
            if (!(CheckStatsType(rptType))) {
                Notify(CorrectReportType(), Usage(), ReportError.ERROR_REPORTTYPE.getErrorCode());
            }
        }

    }

    /**
     * convert the incorrect argument enumeration.
     * @return incorrect argument message
     */
    static final String CorrectArgument() {
        return ReportError.ERROR_ARGUMENT.toString();
    }

    /**
     * convert the incorrect folder enumeration.
     * @return incorrect folder message.
     */
    static final String CorrectFolder() {
        return ReportError.ERROR_FOLDER.toString();
    }

    /**
     * convert the incorrect statistic separator enumeration.
     * @return incorrect separator message
     */
    static final String CorrectStatsSeparator() {
        return ReportError.ERROR_SEPARATOR.toString();
    }
    
    /**
     * convert the incorrect statistic type enumeration.
     * @return 
     */
    static final String CorrectReportType() {
        return ReportError.ERROR_REPORTTYPE.toString();
    }
    

    /**
     * proper usage of the program.
     * @return usage message
     */
    static final String Usage() {
        return "\n\tUsage : prog <DirectoryPath> <StatsType1:StatsName1, ... ,StatsType(n):StatsName(n)>"
                + "\n\tWhere StatsType is either PERFORMANCE or COUNT";
    }

    /**
     * check either valid separator is supplied.
     * @param args - arguments from main
     * @return true if contains valid separator
     */
    static final boolean CheckStatsSeparator(String args) {
        String[] totalStats = args.split(String.valueOf(COMMA));
        for (String stat : totalStats) {
            if (!stat.contains(String.valueOf(COLON))) {
                return false;
            }
        }
        return true;
    }

    /**
     * check given folder. will try to follow the soft link if provided.
     * @param folder
     * @return true if folder is accessible.
     */
    static final boolean CheckFolder(String folder) {
        return Files.isDirectory(Paths.get(folder));
    }

    /**
     * check against the report/statistic type whether it is listed. 
     * @param rptType - type of statistic.
     * @return true if match one (case insensitive) of the report type.
     */
    static final boolean CheckStatsType(String rptType) {
        String sub = rptType.split(COLON.toString(),TWO)[0];
        logger.debug("given=[" + rptType +"];splitted=[" + sub + "]");
        boolean found = false;
        for (ReportType rpt : ReportType.values()) {
            logger.trace("comparedWith=" + rpt);
            if (rpt.toString().equalsIgnoreCase(sub)) {
                found = true;
                break;
            }
        }
        return found;
    }
    
    /**
     * utility method to return error message and exit program immediately.
     * @param errorMsg - what error message to be displayed.
     * @param usage - message on how to use the program.
     * @param errorCode - error code in integer for classification.
     */
    static final void Notify(String errorMsg, String usage, int errorCode) {
        logger.error(errorMsg);
        logger.error(usage);
        System.exit(errorCode);
    }

}
