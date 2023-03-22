package Singleton;
public class DatabaseSingleton {
    private static DatabaseSingleton instance;

    private DatabaseSingleton(){
        //Databázová incializace
    }

    public static DatabaseSingleton getInstance(){
        if(instance == null){
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    public static void removeInstance(){
        if(instance != null){
            //Close connection to DB
            instance = null;
        }
    }
}
