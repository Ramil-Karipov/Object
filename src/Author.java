import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " ";
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Author eSeNiN2 = (Author) other;
        return this.firstName == eSeNiN2.firstName || firstName != null && eSeNiN2.firstName.equals(this.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
