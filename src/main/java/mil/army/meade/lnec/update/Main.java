package mil.army.meade.lnec.update;

import java.io.File;

import mil.army.meade.lnec.update.modules.IXLSXParser;

public class Main {

    public Main() {
	IXLSXParser ip = new IXLSXParser();
	
	try {
	    ip.parse(new File("C:\\users\\jerem\\Downloads\\Meade.xlsx"));
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
}
