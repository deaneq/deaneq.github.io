package ioc;

import java.io.File;
import java.util.List;

/**
 * @author Xavi Torrens
 */
//Segon canvi, quest en una nova branca
//Canvi fet i pujat per B
public class TraditionalLog {

    public static void main(String[] args) {

        boolean logError = false;
        boolean logWarn = false;
        boolean isInfo = true;

        List<String> list = null;

        if ( list == null && logWarn) System.out.println("WARN " + "LLista nula");

        try {
            if (isInfo) System.out.println("INFO" + "Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe){
            if (logError) System.out.println("ERROR" + " excepcio:" + npe.getMessage());
        }

    }
}
