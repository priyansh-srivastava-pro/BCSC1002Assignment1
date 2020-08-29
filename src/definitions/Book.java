/*  Created by IntelliJ IDEA.
 *  User: Priyansh Srivastava
 *  Date: 25/08/20
 *  Time: 18:00 PM
 *  File Name : Book.java
 * */

package definitions;

import java.util.Objects;

public class Book {
        //fields

        private String bookName;
        private String bookAuthorName;
        private String bookIsbnNumber;

        // Constructor Method
        // Non-Parameterized Constructor Method

        public Book(String bookName, String bookAuthorName, long l) {
            this.bookName = "Five Point Someone";
            this.bookAuthorName = "Chetan Bhagat";
            this.bookIsbnNumber = "9788129104595";
        }

    public Book(String bookName, String bookAuthorName, String bookIsbnNumber) {
            this.bookName = bookName;
            this.bookAuthorName = bookAuthorName;
            this.bookIsbnNumber = bookIsbnNumber;
        }

    public Book() {
            this.bookName = bookName;
            this.bookAuthorName = "Chetan Bhagat";
            this.bookIsbnNumber = " 9788129104595";
        }

        public String getBookName () {
            return bookName;
        }

        public void setBookName (String bookName){
            this.bookName = bookName;
        }

        public String getBookAuthorName () {
            return bookAuthorName;
        }

        public void setBookAuthorName (String bookAuthorName){
            this.bookAuthorName = bookAuthorName;
        }

        public String getBookIsbnNumber () {
            return bookIsbnNumber;
        }

        public void setBookIsbnNumber (String bookIsbnNumber){
            this.bookIsbnNumber = bookIsbnNumber;
        }


        //  The toString() method
        // public String toString() {}

        @Override
        public String toString () {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", bookAuthorName='" + bookAuthorName + '\'' +
                    ", bookIsbnNumber='" + bookIsbnNumber + '\'' +
                    '}';
        }


        // The equals() method
        // The HashCode() method
        @Override
        public boolean equals (Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Book book = (Book) obj;
            return getBookAuthorName() == book.getBookAuthorName() &&
                    bookIsbnNumber() == book.getBookIsbnNumber() &&
                    Objects.equals(getBookName(), book.getBookName());
        }

        private String bookIsbnNumber () {
            return bookIsbnNumber;
        }

        @Override
        public int hashCode () {
            return Objects.hash(getBookName(), getBookAuthorName(), getBookIsbnNumber());
        }

        public void issueBookName (String bookName){
        }

        public void doReturn (String bookName){
        }

        public void issuedBooks (String bookName){
        }
    }
