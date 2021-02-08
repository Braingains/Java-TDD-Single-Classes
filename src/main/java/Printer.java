public class Printer {

    private int numberOfRemainingSheets;
    private int remainingToner;

    public Printer(int numberOfRemainingSheets, int remainingToner){
        this.numberOfRemainingSheets = numberOfRemainingSheets;
        this.remainingToner = remainingToner;

    }

    public boolean print(int pages, int copies){
        int paperRequired = pages * copies;
        if ((paperRequired <= numberOfRemainingSheets) & (paperRequired <= remainingToner)) {
            numberOfRemainingSheets -= paperRequired;
            remainingToner -= paperRequired;
            return true;
        } else {
            return false;
        }
    }

    public int getRemainingSheets(){ return this.numberOfRemainingSheets; }

    public int getRemainingToner(){ return this.remainingToner; }

}


