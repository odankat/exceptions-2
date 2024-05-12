public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void Check() {

        if (login.matches("[a-zA-Z0-9_]+") && login.length() <= 20) {
            System.out.println("Логин правильный");
        } else {
            throw new WrongLoginException("логин не правильный ");
        }
        if (password.equals(confirmPassword) == true && password.matches("[a-zA-Z0-9_]+") && password.length() <= 20) {
            System.out.println("Пароль правильный");
        } else {
            throw new WrongPasswordException("Пароль не правильный");
        }
    }
    }

