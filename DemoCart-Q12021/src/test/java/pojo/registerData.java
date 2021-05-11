package pojo;

public class registerData {
    private String firstName;
    private String lastName;
    private String emailRegister;
    private String telephone;
    private String password;
    private String confirmPassword;

    public registerData(String _firstName, String _lastName, String _emailRegister, String _telephone, String _password, String _confirmPassword) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.emailRegister = randomEmail() + _emailRegister; // metodo + json
        this.telephone = _telephone;
        this.password = _password;
        this.confirmPassword = _confirmPassword;
    }
    public String randomEmail()
    {
        //metdod
        return "";
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailRegister() {
        return this.emailRegister;
    }
    public String getTelephone(){
        return this.telephone;
    }
    public String getPassword() {
        return this.password;
    }
    public String getConfirmPassword(){
        return this.confirmPassword;
    }
}
