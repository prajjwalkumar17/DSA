package oops.Composition;

public class Bed {
    private int length;
    private Bedsheet bedsheet;

    public Bed(int length, Bedsheet bedsheet) {
        this.length = length;
        this.bedsheet = bedsheet;
    }

    public int getLength() {
        return length;
    }

    public Bedsheet getBedsheet() {
        return bedsheet;
    }
}
