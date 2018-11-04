package myAssignment2;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ConvertPDF {

    public static void PDF(){

        List<Table> tableList = new ArrayList<Table>();

        try {

            FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\User\\IdeaProjects\\Assignment_2\\ChessExcel.xlsx"));
            XSSFWorkbook excel = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = excel.getSheetAt(0);

            //Iterator<Row> rowIterator = sheet.iterator();
            Document PDF = new Document(PageSize.A4);
            PdfWriter.getInstance(PDF, new FileOutputStream("ChessResultList.pdf"));

            Anchor anchor = new Anchor("Title");
            anchor.setName("KEJOHANAN TERTUTUP KUANTAN 2018 LELAKI");

            PdfPTable table = new PdfPTable(6);
            table.setWidths(new float[]{4,16,4,4,4,10});
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

            for (Table myTable : tableList){

                table.addCell(myTable.getNum());
                table.addCell(myTable.getName());
                table.addCell(myTable.getFieldID());
                table.addCell(myTable.getFed());
                table.addCell(myTable.getRtg());
                table.addCell(myTable.getClubCity());
            }

            PDF.open();
            PDF.add(table);

            System.out.println("\nSuccess");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openExcel() {
        try {
            Desktop.getDesktop().open(new File("ChessResultList.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





/*for (int j=0;j<=154;j++){
                table.addCell(tableList.get(j).getNum());
                table.addCell(tableList.get(j).getName());
                table.addCell(tableList.get(j).getFieldID());
                table.addCell(tableList.get(j).getFed());
                table.addCell(tableList.get(j).getRtg());
                table.addCell(tableList.get(j).getClubCity());
            }*/
