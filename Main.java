import Repository.TodoListRepositoryImpl;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryDblmpl;
import Services.ToDoListServices;
import Services.ToDoListServicesImpl;
import Views.ToDoListTerminalViews;
import Views.ToDoListViews;
import config.Database;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database= new Database("databaseku", "root", "", "localhost", "3306");
        database.setup();
        TodoListRepository todoListRepository = new TodoListRepositoryDblmpl(database);
        ToDoListServices toDoListServices = new ToDoListServicesImpl(todoListRepository);
        ToDoListViews toDoListViews = new ToDoListTerminalViews(toDoListServices);
        toDoListViews.run();
    }
}