package views;

import services.TodoListService;

public class TodoListTerminalView implements TodoListView {
    public static Scanner scanner = new Scanner(System.in);
    private final TodoListService todoListService;

    public TodoListTerminalView(final TodoListService todoListService){
        this.todoListService = todoListService;
    }

    @Override
    todos[number - 1] = newTodo;
        return true;
}

public static String input(String info) {
    System.out.print(info + " : ");
    var data = scanner.nextLine();
    return data;
}

public static void showMainMenu() {
    // infinite loop so the program will always run
    boolean isRunning = true;
    while (isRunning) {
        showTodoList();
        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Edit");
        System.out.println("4. Keluar");
        // input untuk menerima input dari user
        String selectedMenu = input("Pilih");

        switch (selectedMenu) {
            case "1":
                showMenuAddTodoList();
                break;
            case "2":
                showMenuRemoveTodoList();
                break;
            case "3":
                showMenuEditTodoList();
                break;
            case "4":
                isRunning = false;
                break;
            default:
                System.out.println("Pilih menu dengan benar");
        }
    }
}

public void run() {
        showMainMenu();
    }

}

