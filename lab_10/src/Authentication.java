public interface Authentication {
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldpassword, String newpassword);
}

class UserAuthentication implements Authentication{
    public String username;
    public String password;


    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    @Override
    public void logout() {
        System.out.println("User logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldpassword, String newpassword){
        if(this.username.equals(username) && this.password.equals(oldpassword)){
            this.password = newpassword;
            return true;
        } else {
            return false;
        }
    }


}

class AdminAuthentication implements Authentication{
    public String Adminusername;
    public String Adminpassword;
    @Override
    public boolean login(String username, String password) {
        return this.Adminusername.equals(username) && this.Adminpassword.equals(password);
    }
    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }

    @Override
    public boolean resetPassword(String adminusername, String adminoldpassword, String adminnewpassword){
        if(this.Adminusername.equals(adminusername) && this.Adminpassword.equals(adminoldpassword)){
            this.Adminpassword = adminnewpassword;
            return true;
        } else {
            return false;
        }
    }
}

class AuthenticationTest{
    public static void main(String[] args) {
        Authentication userAuth = new UserAuthentication("user123", "pass123");
        System.out.println("User Login: " + userAuth.login("user123", "pass123"));  // true
        userAuth.logout();
        System.out.println("Reset Password: " + userAuth.resetPassword("user123", "pass123", "newpass"));
    }
}
