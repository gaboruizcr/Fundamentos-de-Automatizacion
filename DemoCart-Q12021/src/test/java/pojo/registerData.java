package pojo;

import java.util.Random;

public class registerData {
    private String firstName;
    private String lastName;
    private String emailRegister;
    private String telephone;
    private String password;
    private String confirmPassword;

    public String randomEmail()
    {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder rd = new StringBuilder();
        Random random = new Random();

        int length = 6;
        for(int i=0; i < length; i++) {

            int index = random.nextInt(abc.length());
            char randomChar = abc.charAt(index);

            rd.append(randomChar);
        }
        return rd.toString().toLowerCase();
    }

    public registerData(String _firstName, String _lastName, String emailRegister, String _telephone, String _password, String _confirmPassword) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.emailRegister = emailRegister; // metodo + json
        this.telephone = _telephone;
        this.password = _password;
        this.confirmPassword = _confirmPassword;
    }
    public registerData(String emailRegister, String password){
        this.emailRegister = emailRegister;
        this.password = password;
    }


    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailRegister() {
        return randomEmail() + emailRegister;
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
