package Project_01_Design_Patterns.Design_Pattern_2_Cititor_Contabilitate;

public class NumbersReader extends DataReader{
    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet: ");
    }
}
