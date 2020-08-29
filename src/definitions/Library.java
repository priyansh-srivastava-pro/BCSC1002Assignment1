/*  Created by IntelliJ IDEA.
 *  User: Priyansh Srivastava
 *  Date: 25/08/20
 *  Time: 18:00 PM
 *  File Name : Book.java
 * */

package definitions;

import java.util.Arrays;

public class Library {
    private Book[] store;


    public Library() {
        this.store = new Book[50];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book("Book" + (i + 1), null, 9788129104595L + (i + 1));
        }
    }

    public Library(Book[] store) {
        this.store = store;
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Library that = (Library) obj;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

}
