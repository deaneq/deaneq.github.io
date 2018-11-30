package ioc.solucio;

/**
 * @author Xavi Torrens
 */

// Un tercer canvi, segon a la branca test
// El quart commit, el tercer té el commit però encara no està pujat a GitHub 
// Un canvi treballant amb el meu col·laborador
// Amb la connexió bona al repo

public class LogConsole extends LogAbstract {

    public void logInfo(String textToLog) {
        if (isLogInfo()){
            System.out.println(INFO_PREFIX + textToLog);
        }

    }

    public void logWarn(String textToLog) {
        if (isLogWarn()){
            System.out.println(WARN_PREFIX + textToLog);
        }

    }

    public void logError(String textToLog) {
        if (isLogInfo()){
            System.out.println(ERROR_PREFIX + textToLog);
        }

    }
}
