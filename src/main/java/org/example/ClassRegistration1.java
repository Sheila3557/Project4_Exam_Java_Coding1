package org.example;

public class ClassRegistration1 {

    private String email;
    private String userName;
    private String password;

    ClassRegistration1(String email, String userName, String password) {
        if (isEmailValid(email) && isUserNameValid(userName) && isPasswordValid(password)) {
            this.email = email;
            this.userName = userName;
            this.password = password;
        }

    }

    void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    String getEmail() {
        return email;
    }

    private boolean isEmailValid(String email) {
        if (email.contains("yahoo")) {
            return true;
        } else {
            System.out.println("Invalid email address");
            return false;
        }
    }

    void setUserName(String userName) {
        if (isUserNameValid(userName)) {
            this.userName = userName;
        }
    }

    String getUserName() {
        return userName;
    }

    private boolean isUserNameValid(String userName) {
        if (!userName.isEmpty()) {
            if (userName.length() >= 6) {
                return true;
            } else {
                System.out.println("UserName is too short");
                return false;
            }
        } else {
            System.out.println("UserName can not be empty");
            return false;
        }

    }

    void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    String getPassword () {
        return password;
    }

    private boolean isPasswordValid(String password) {
        if (!password.isEmpty()) {
            if (!password.equalsIgnoreCase(userName)) {
                return true;
            } else {
                System.out.println("Username cannot be your password");
                return false;
            }
        } else {
            System.out.println("password can not be empty");
            return false;
        }
    }

}

class ClassRegTester {
    public static void main(String[] args) {
        ClassRegistration1 user1 = new ClassRegistration1("spvgn@yahoo", "sheila123", "0987654");
        user1.setEmail("spvgn@yahoo.com");
        user1.setUserName("sheila123");
        user1.setPassword("0987654");
        System.out.println(user1.getEmail() + "; " + user1.getUserName() + "; " + user1.getPassword());

    }
}






