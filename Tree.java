public class Tree {
    private int idNumber;
    private int age;
    private String speciesName;

    public Tree(int idNumber, int age, String speciesName) {
        this.idNumber = idNumber;
        this.age = age;
        this.speciesName = speciesName;
    }

    @Override
    public String toString() {
        return "ID: " + idNumber + ", Age: " + age + ", Species: " + speciesName;
    }
}
