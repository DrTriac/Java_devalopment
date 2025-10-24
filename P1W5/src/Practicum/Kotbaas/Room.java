package Kotbaas;

public class Room {
    int roomNumber;
    String studentName;
    double pricePerMonth;
    Student student;

    public Room(int roomNumber, double pricePerMonth) {
        this.roomNumber = roomNumber;
        this.studentName = "leegstaand";
        this.pricePerMonth = pricePerMonth;
    }
    public Room()
    {
        this.studentName = "leegstaand";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public void setStudent(Student student) {

            this.student = student;
            if (student != null) {
                this.studentName = student.getName();
            } else {
                this.studentName = "leegstaand";
            }

    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {

        String studentInfo = (student != null) ? student.toString() : "leegstaand";
        return String.format("Kamer %d: %s (%.1f€)", roomNumber, studentInfo, pricePerMonth);
    }
}

