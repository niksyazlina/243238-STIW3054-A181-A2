package myAssignment2;

public class assignment2 {

    public static void main(String args[]) {
        try{

            ReadExcel read = new ReadExcel();
            read.readExcel();

            ConvertPDF pdf = new ConvertPDF();
            pdf.PDF();

            ConvertPDF open = new ConvertPDF();
            open.openPDF();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
