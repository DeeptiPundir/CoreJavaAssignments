package assignment02;

public class File_Database {
    public static void main(String[] args) {

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.persist();

        DatabasePersistence databasePersistence = new DatabasePersistence();
        databasePersistence.persist();

    }
}

abstract class Persistence {

    abstract public void persist();

}

class FilePersistence extends  Persistence{

    @Override
    public void persist() {
        System.out.println("FilePersist .......");
    }
}

class DatabasePersistence extends Persistence{

    @Override
    public void persist() {
        System.out.println("Database Persist .........");
    }
}
