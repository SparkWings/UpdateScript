package mil.army.meade.lnec.update.modules;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mil.army.meade.lnec.update.Module;

public class IXLSXParser extends Module{

    public IXLSXParser() {
	super("XLSX Parsing Thread");
    }

    public void parse(File file) throws Exception {
	
	InputStream in = new FileInputStream(file);
	//14
	
	Workbook wb = new XSSFWorkbook(in);
	Sheet sheet = wb.getSheet("(daily) Meade_Group A _ B combi");

	for(int i = 1; i < sheet.getLastRowNum(); i++) {
	    
	
	CellReference cr = new CellReference(14, i);
	Row r = sheet.getRow(cr.getRow());
	Cell c = r.getCell(i);
	
	System.out.println(c.getStringCellValue());
	
	}
	wb.close();
	
    }
    
}
