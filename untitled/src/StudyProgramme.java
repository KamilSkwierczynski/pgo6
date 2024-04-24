public class StudyProgramme {
    String name;
    String description;
    private final int numberOfSemesters;
    private final int numberOfPossibleITNs;

    public StudyProgramme(String name, String description, int numberOfSemesters, int numberOfPossibleITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfPossibleITNs = numberOfPossibleITNs;
    }

    public int getNumberOfPossibleITNs() {
        return numberOfPossibleITNs;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
}

