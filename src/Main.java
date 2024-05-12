public class Main {
    public static void main(String[] args) {
        User user = new User("login", "fds", "qwerty123");
        try {
            user.Check();
        } catch (WrongLoginException exception) {
            exception.printStackTrace();
        } catch (WrongPasswordException exception) {
            exception.printStackTrace();
        }
        System.out.println("hello");

    }
}