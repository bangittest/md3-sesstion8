package login.imployee;

public class User {
    private String id;
    private String username;
    private String password;

    public User(){}

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username,String password){
        if (this.username.equals(username)&&this.password.equals(password)){
            System.out.println("Đăng nhập thành công");
            return true;
        }else {
            System.out.println("Đăng nhập thất bại");
        }
        return false;
    }

    public String displayData() {
        return "User" +
                "id=" + id +
                ", name='" +username
               ;
    }
}
