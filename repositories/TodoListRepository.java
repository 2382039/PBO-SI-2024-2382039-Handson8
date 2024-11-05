package repositories;

public class TodoLIstRepositoryImpl implements TodoListRepository{
    public static TodoList[] todos=new TodoList[10];

    @Override
    public TodoList[] getAll(){
        return todos;
    }

    @Override
    public void add(final TodoList todoList){

    }

    @Override
    public Boolean remove(final Integer id){
        return null;
    }

}
