package Project_01_Design_Patterns.Design_Pattern_2_Cititor_pentru_Fisiere;

public abstract class DataReader {
    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if (fileName.endsWith(getExtension())) {
            this.doRead(fileName);
            return;
        }

        if (next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract String getExtension();

    protected abstract void doRead(String fileName);
}
