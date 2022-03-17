package oops.Encapsulation;

public class Printer {
    private int tonerLevel;
    private String Type;
    private int noOfPagesPrinted;

    public Printer(int tonerLevel, String type, int noOfPagesPrinted) {
        if (tonerLevel < 101 && tonerLevel > 0) {
            this.tonerLevel = tonerLevel;
        }
        Type = type;
        this.noOfPagesPrinted = noOfPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public String getType() {
        return Type;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public void filllToner(int level) {
        if (level < 101 && level > 0) {
            int newlabel = tonerLevel + level;
            if (newlabel > 100) {
                System.out.println("The level was already " + this.tonerLevel + " you can add level upto " + (100 - this.tonerLevel));
            } else {
                System.out.println("successfully filled the toner\nThe new Toner level is " + newlabel);
            }
        } else {
            System.out.println("The Level can't be more than 100%");
        }
    }

    public void printPages(int pages) {
        if (this.Type.equals("Duplex")) {
            System.out.println("Printing in Duplex Mode");
            pages /= 2;
        }
        this.noOfPagesPrinted += pages;
    }
}
