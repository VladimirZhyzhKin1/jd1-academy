package task35;

public enum SeasonsOfTheYear {
    SUMMER(92, "Relax-life is good"),
    LEAF_FALL(91, "Winter is comming"),
    WINTER(90, "Cold and walking Dead"),
    SPRING(91, "New life - new hopes");

    private final int countOfDays;
    private final String description;

    SeasonsOfTheYear(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public static void printSeason() {
        SeasonsOfTheYear[] season = SeasonsOfTheYear.values();

        for (SeasonsOfTheYear positions : season) {
            System.out.println();
            System.out.println(positions + "\n countOfDay: " + positions.countOfDays + "\n description: " + positions.description);
        }
    }
}
