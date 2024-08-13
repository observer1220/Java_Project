public class Robot {
    private String name;
    private int yearMade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYearMade(int yearMade) {
        if (yearMade < 1990) {
            System.out.println("Year made cannot be earlier than 1990.");
        } else if (yearMade > 2024) {
            System.out.println("Year made not yet come.");
        } else {
            this.yearMade = yearMade;
        }
    }

    public int getYearMade() {
        return this.yearMade;
    }
}
