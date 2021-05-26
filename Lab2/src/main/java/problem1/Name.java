package problem1;

import java.util.Objects;

/**
 * class Name obejct that contians first name and last name
 */
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  /**
   *
   * @param firstName - first name
   * @param middleName - middle name
   * @param lastName - last name
   * @return - a new Name object
   */

  public Name(String firstName, String middleName,String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  /*
  return the first name
   */
  public String getFirstName() {
    return firstName;
  }
  /*
  return the middle name
   */
  public String getMiddleName() {
    return middleName;
  }

  /*
  return the last name
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(),getMiddleName(),getLastName());
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Name)) return false;
    Name name = (Name) obj;
    return Objects.equals(getFirstName(), name.getFirstName()) &&
        Objects.equals(getMiddleName(), name.getMiddleName()) &&
        Objects.equals(getLastName(), name.getLastName());
  }

  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
