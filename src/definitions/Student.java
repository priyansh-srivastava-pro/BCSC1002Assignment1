/*  Created by IntelliJ IDEA.
 *  User: Priyansh Srivastava
 *  Date: 25/08/20
 *  Time: 18:00 PM
 *  File Name : Book.java
 * */

package definitions;

import java.util.Arrays;

public class Student {

    // fields
    String studentFirstName;
    String studentMiddleName;
    String studentLastName;
    long studentUniversityRollNumber;
    int numberOfBooksIssued;
    Book[] Issued;

    // Constructor Method
    // Non-Parameterized Constructor Method

    public Student() {
        this.studentFirstName = "Arun";
        this.studentMiddleName = "Kumar";
        this.studentLastName = "Srivastava";
        this.studentUniversityRollNumber = 191500607;
        this.numberOfBooksIssued = 10;
        this.Issued = new Book[5];
    }

    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long studentUniversityRollNumber, int numberOfBooksIssued, Book[] Issued) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.Issued = Issued;
    }

    public Student(String studentFirstName) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = "Kumar";
        this.studentLastName = "Srivastava";
        this.studentUniversityRollNumber = 191500607;
        this.numberOfBooksIssued = 10;
        this.Issued = Issued;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }
    // getter

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return getStudentMiddleName();
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    // setter

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getIssued() {
        return Issued;
    }

    public void setIssued(Book[] issued) {
        Issued = issued;
    }

    @Override
    public String toString() {
        return "Student First Name: " + getStudentFirstName() + ", " +
                "Student Middle Name: " + getStudentMiddleName() + ", " +
                "Student Last Name: " + getStudentFirstName() + ", " +
                "Student University Roll Number: " + getStudentUniversityRollNumber() +
                "Number of Books Issued: " + getNumberOfBooksIssued() + ", " +
                "Name Of The Books Issued: " + getIssued() + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student that = (Student) obj;
        return Arrays.equals(getIssued(), that.Issued);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getIssued());
    }
}

