package my.asufian.openet.utility;

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
     *
     * @param args - must met the ARGS_REQUIRED.
     */
    public static void CheckArgument(String[] args) {
        if (!(args.length == ARGS_REQUIRED)) {
            logger.error(CorrectArgument());
            logger.error(Usage());
            System.exit(ERROR_ARGUMENT);
        }
    }

    static final String CorrectArgument() {
        return ReportError.ERROR_ARGUMENT.toString();
    }

    static final String CorrectStatsSeparator() {
        return ReportError.ERROR_SEPARATOR.toString();

    }

    public static String Usage() {
        return "\n\tUsage : prog <DirectoryPath> <StatsType1:StatsName1, ... ,StatsType(n):StatsName(n)>"
                + "\n\tWhere StatsType is either PERFORMANCE or COUNT";

    }

    public static void CheckStatsList(String args) {

        String[] totalStats = args.split(String.valueOf(COMMA));
        for (String stat : totalStats) {
            if (!stat.contains(String.valueOf(COLON))) {
                logger.error(CorrectStatsSeparator());
                logger.error(Usage());
                System.exit(ERROR_SEPARATOR);
            }
        }

    }
}
