package Todo;

public class TestTodo {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        TodoItem item1 = new TodoItem("Kapper", 1, "12/9/2076");
        TodoItem item2 = new TodoItem("Tripje", 2, "11/9/2076");
        TodoItem item3 = new TodoItem("lopen", 8, "13/9/2076");
        TodoItem item4 = new TodoItem("huur", 1, "23/9/2076");

        todoList.addToDoItem(item1);
        todoList.addToDoItem(item2);
        todoList.addToDoItem(item3);
        todoList.addToDoItem(item4);

        todoList.printItems();





    }
}
