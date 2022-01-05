package Project_01_Design_Patterns.Design_Pattern_2_Cititor_pentru_Fisiere;

public class Main {
    public static void main(String[] args) {
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
