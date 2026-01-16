package Todo;
import java.util.ArrayList;
import java.util.LinkedList;

public class TodoList {
    private LinkedList<TodoItem> items;

    public TodoList(){
        items = new LinkedList<>();
    }

    public Boolean addToDoItem(TodoItem item){
        int index = 0;
        if (items.contains(item)){
            for(TodoItem a : items){
                index++;
                if(a.getPriority()>item.getPriority()){
                    index++;
                    items.add(index, item);
                }

            }
        }else items.add(item);
        return true;
    }

    public void printItems(){
        for (TodoItem a : items){
            System.out.println(a);

        }
    }

}