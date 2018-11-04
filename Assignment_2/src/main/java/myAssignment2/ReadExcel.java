package myAssignment2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

    public static void readExcel(){
        try {

            List<Table> tableList = new ArrayList<Table>();

            String File = "C:\\Users\\User\\IdeaProjects\\Assignment_2\\ChessExcel.xlsx";
            FileInputStream excelfile = new FileInputStream(new File(File));

            //create workbook
            XSSFWorkbook excel = new XSSFWorkbook(excelfile);
            XSSFSheet sheet = excel.getSheetAt(0);

            System.out.println("Read data from: http://chess-results.com/tnr380806.aspx?lan=1");
            System.out.println("KEJOHANAN TERTUTUP KUANTAN 2018 LELAKI");
            System.out.println("Starting rank");

            Iterator<Row> iterator = sheet.iterator();
            DataFormatter data = new DataFormatter();

            while(iterator.hasNext()) {
                Row row = iterator.next();

                String number = data.formatCellValue(row.getCell(0));
                String name = row.getCell(1).getStringCellValue();
                String fideId = row.getCell(2).getStringCellValue();
                String fed = row.getCell(3).getStringCellValue();
                String rtg = data.formatCellValue(row.getCell(4));
                String clubcity = row.getCell(5).getStringCellValue();

                tableList.add(new Table(number,name,fideId,fed,rtg,clubcity));
                System.out.printf("%-5s", number);
                System.out.printf("%-50s ", name);
                System.out.printf("%-10s ", fideId);
                System.out.printf("%-10s ", fed);
                System.out.printf("%-10s ", rtg);
                System.out.printf("%-10s ", clubcity);
                System.out.println();
        }

    }catch (Exception e) {
        e.printStackTrace();
    }
}
}


