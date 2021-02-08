public class Printer {

    private int numberOfRemainingSheets;

    public Printer(int numberOfRemainingSheets){
        this.numberOfRemainingSheets = numberOfRemainingSheets;

    }

    public int print(int pages, int copies){
        int paperRequired = pages * copies;
        if (paperRequired <= numberOfRemainingSheets){
            return numberOfRemainingSheets - paperRequired;
        } else {
            return 0;
        }
    }

}


