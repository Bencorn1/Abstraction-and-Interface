public class Gold extends Metal implements Stones{
//    Abstract classes
//    Override the 4 abstract functions in the Metals class

    public char labelSample(){
        return 'C';
    }

    @Override
    public String getTypeOfMetal()
    {
        return "Gold";
    }

    @Override
    public int metalWeight()
    {
        return 9;
    }

    @Override
    int metalVolume() {
        return 600;
    }

    @Override
    String metalColour() {
        return "White";
    }

// Interface class
// Override the 5 functions in the Stones class

    @Override
    public void extractStones() {
        System.out.println("Precious stones are extracted from the ground");
    }

    @Override
    public void cleanStones() {
        System.out.println("Extracted stones are cleaned by passing through water");
    }

    @Override
    public void washStones() {
        System.out.println("The washed stones are washed with washing agents in the washing thickener");
    }

    @Override
    public void purifyStones() {
        System.out.println("Washed stones are purified in a furnace to remove dross and impure agents");
    }

    @Override
    public void cutStones() {
        System.out.println("Purified stones are cut with lasers in order to make it shine");
    }


    public String myVar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "foobar";
        } else if (number % 3 == 0) {
            return "foo";
        } else if (number % 5 == 0) {
            return "bar";
        }
        return "";
    }
}
