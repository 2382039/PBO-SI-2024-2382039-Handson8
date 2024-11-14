package Services;

import Entities.ToDoList;

public interface ToDoListServices {
    ToDoList[] getTodoList();
    void addTodoList(String todo);
    Boolean removeTodoList(Integer number);
    Boolean editTodoList(Integer number, String todo);
}