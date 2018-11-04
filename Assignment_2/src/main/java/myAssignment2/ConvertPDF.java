package myAssignment2;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.*;


public class ConvertPDF {

    public void PDF() {

        try {

            FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\User\\IdeaProjects\\Assignment_2\\ChessExcel.xlsx"));
            XSSFWorkbook excel = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = excel.getSheetAt(0);

            Document PDF = new Document();
            PdfWriter.getInstance(PDF, new FileOutputStream("ChessResultList.pdf"));

            PdfPTable table = new PdfPTable(6);
            table.setWidths(new float[]{8, 50, 10, 10, 10, 30});
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

            for (Table myTable : ReadExcel.tableList) {

                table.addCell(myTable.getNum());
                table.addCell(myTable.getName());
                table.addCell(myTable.getFieldID());
                table.addCell(myTable.getFed());
                table.addCell(myTable.getRtg());
                table.addCell(myTable.getClubCity());
            }

            PDF.open();
            PDF.add(table);
            PDF.add(Chunk.NEWLINE);

            Paragraph paragraph = new Paragraph();
            for (String word : ReadExcel.string) {
                paragraph.add(word);
                paragraph.add("\n");
            }
            PDF.add(paragraph);
            PDF.add(Chunk.NEWLINE);
            PDF.close();

            System.out.println("\nSuccess");
            System.out.println("\nOpen PDF");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openPDF() {
        try {
            Desktop.getDesktop().open(new File("ChessResultList.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



