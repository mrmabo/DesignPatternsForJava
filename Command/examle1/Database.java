package Command.examle1;

public class Database {
    public boolean save(Person person) {
        //save person object into the database
        try {
            return savePerson(person);
        } catch (Exception e)

        {
            e.printStackTrace();
            return false;
        }

    }

    public boolean remove(Person person) {
        // remove person from the database
        try {
            return removePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean savePerson(Person p) throws Exception {
        //send an 'insert' SQL query to the database and return a true or false value;
        return true;
    }

    private boolean removePerson(Person p) throws Exception {
        //send a delete SQL query to the database and return a true or false value;
        return true;
    }
}
