public class B_Access_Modifiers {

    public static void main(String args[]){
        Bankaccount myAcc = new Bankaccount();
        myAcc.username="Harsh";
        myAcc.setPassword("abcdefgi");
    }
}

class Bankaccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
