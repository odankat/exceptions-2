public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String massage){
        super(massage);
    }
}
