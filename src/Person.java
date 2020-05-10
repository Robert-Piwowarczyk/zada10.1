public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) {
        if(firstName == null||firstName.length()<3) {
            throw new NameUndefinedException();
        } this.firstName = firstName;

        if(lastName == null||lastName.length()<3) {
            throw new NameUndefinedException();
        } this.lastName = lastName;

        if(age == 0||age<1) {
            throw new IncorrectAgeException();
        } this.age = age;

        if(pesel == 0||pesel<1) {
            throw new IncorrectAgeException();
        } this.pesel = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
