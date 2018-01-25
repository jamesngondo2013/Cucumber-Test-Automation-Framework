package dataHelper;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper
{
    public static String excelFilePath = "C:\\Users\\c5261355\\Downloads\\default.xlsx";
    public static FileInputStream excelFile;
    public static Workbook workbook;
    public static Sheet datatypeSheet;
    public static Iterator<Row> rowIterator;
    public static ArrayList<String> userList;

    public static List<HashMap<String, String>> datamap;

    public static HashMap<String, String> storeValues = new HashMap();

    public static List<HashMap<String, String>> data (String filepath, String sheetName)
    {
        List<HashMap<String, String>> mydata = new ArrayList<>();
        try {
            FileInputStream fs = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            Row HeaderRow = sheet.getRow(0);
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row currentRow = sheet.getRow(i);
                HashMap<String, String> currentHash = new HashMap<String, String>();
                for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
                    Cell currentCell = currentRow.getCell(j);
                    switch (currentCell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        // System.out.print(currentCell.getStringCellValue() +
                        // "\t");
                        currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
                            currentCell.getStringCellValue());
                        break;
                    }
                }
                mydata.add(currentHash);
            }
            fs.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return mydata;
    }

    public static void processExcelData (String arg1)
    {
        int index = Integer.parseInt(arg1) - 1;
        System.out.println("Printing current data set...");
        for (HashMap h : datamap) {
            // System.out.println(h.keySet());
            System.out.println(h.values());
        }

    }

    public static void main (String[] args)
    {
        datamap = DataHelper.data(excelFilePath, "Sheet1");
        DataHelper.processExcelData("3");
    }
}
