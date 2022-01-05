package Project_01_Design_Patterns.Design_Pattern_2_Cititor_Contabilitate;

public class ExcelReader extends DataReader{
    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
