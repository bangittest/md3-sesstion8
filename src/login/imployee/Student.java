package login.imployee;

public class Student extends User{
    private String subject;

    public Student(String id, String username, String password, String subject) {
        super(id, username, password);
        this.subject = subject;
    }


    @Override
    public String displayData(){
        super.displayData();
        System.out.println("Môn : "  +subject);
        return null;
    }

    public void displayData(String message){
        System.out.println(message);
        displayData();
    }
}
