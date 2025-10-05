public class User_OverConst {

    String username;
    String email;
    int age;

    User_OverConst(){
        this.username="Guest";
        this.email="Not provided";
    }
    User_OverConst(String username){
        this.username=username;
        this.email="Not provided";
        this.age=0;
    }
    User_OverConst(String username, String email){
        this.username=username;
        this.email=email;
        this.age=0;
    }
    User_OverConst(String username, String email, int age){
        this.username=username;
        this.email=email;
        this.age=age;
    }
}
