package Project_01_Design_Patterns.Design_Pattern_2_Cititor_pentru_Fisiere;

public class QuickBooksReader extends DataReader{
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
