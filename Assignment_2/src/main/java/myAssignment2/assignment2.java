package myAssignment2;

public class assignment2 {

    public static void main(String args[]) {
        try{
            ReadExcel.readExcel();
            ConvertPDF.PDF();
            ConvertPDF.openExcel();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
