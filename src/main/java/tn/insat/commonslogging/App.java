package tn.insat.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class App 
{
    public static void main( String[] args )
    {
    	Log log = LogFactory.getLog(App.class);
    	
        log.debug("===> Ici Commons Logging - Hello World!" );
    }
}
