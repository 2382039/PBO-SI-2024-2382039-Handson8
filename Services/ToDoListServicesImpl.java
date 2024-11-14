package Services;

import Entities.ToDoList;
import Repository.TodoListRepository;

public class ToDoListServicesImpl implements ToDoListServices {
    private final TodoListRepository todoListRepository;

    public ToDoListServicesImpl(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public ToDoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void addTodoList(String todo) {
        if (todo.isBlank() || todo.isEmpty()) {
            System.out.printf("Masukkan todo dengan benar");
            return;
        }
        ToDoList toDoList = new ToDoList();
        toDoList.setTodo(todo);
        todoListRepository.add(toDoList);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return todoListRepository.remove(number);
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        ToDoList toDoList = new ToDoList();
        toDoList.setTodo(todo);
        toDoList.setId(number);
        return todoListRepository.edit(toDoList);
    }
}