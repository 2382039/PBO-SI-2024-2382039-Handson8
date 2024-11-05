package services.;

import repositories.TodoListRepository;

public class TodoListServicesImpl implements TodoListService {
    private final TodoListRepository todoListRepository;

    public TodoListServicesImpl(final  TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void addTodoList(final String todo) {
        if (todo.isEmpty() || todo.isBlank()) {
            return;
        }

        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepository.add(todoList);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return todoListRepository.remove(number);
    }

    @Override
    public Boolean editTodoList(final Integer number, final String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoList.setId(Number);
    }
}
