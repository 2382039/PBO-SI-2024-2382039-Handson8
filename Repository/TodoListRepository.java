package Repository;

import Entities.ToDoList;

public interface TodoListRepository {
    ToDoList[] getAll();
    void add(ToDoList todoList);
    Boolean remove(Integer id);
    Boolean edit(ToDoList todoList);
}
