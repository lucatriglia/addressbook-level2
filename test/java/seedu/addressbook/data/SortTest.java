package seedu.addressbook.data;

import org.junit.Test;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TestUtil;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {

    // should sort after adding a new person
    @Test
    public void sort_normalList_listsAlphabetically() throws Exception {
        Person p1 = TestUtil.generateTestPersonWithName("Bob");
        Person p2 = TestUtil.generateTestPersonWithName("Alice");
        AddressBook book = new AddressBook();
        book.addPerson(p1);
        book.addPerson(p2);
        book.sortAddressBook();

        List<ReadOnlyPerson> persons = book.getAllPersons().immutableListView();

        assertEquals(persons.get(0).getName().toString(), "Alice");
        assertEquals(persons.get(1).getName().toString(), "Bob");
    }
}
