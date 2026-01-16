package Todo;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private String description;
    private int priority;
    private LocalDate deadline;

    public TodoItem(String description, int priority, String deadline) {
        this.description = description;
        this.priority = priority;
        this.deadline = formatDeadline(deadline);
    }

    private LocalDate formatDeadline(String deadline) {
        String day = deadline.substring(0,1);
        String month = deadline.substring(3,4);
        String year = deadline.substring(5,9);
        LocalDate retval = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));

        if (retval.isBefore(LocalDate.now())) {
            System.out.println("date of item cannot be in the past. please enter a date in the future");
        }
        return retval;
    }

    @Override
    public String toString()
    {
        return String.format("%s\t%s\t%s", this.priority, this.description, this.deadline);
    }

    public String getDescription() {
        return this.description;
    }

    public int getPriority() {
        return this.priority;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }
}
