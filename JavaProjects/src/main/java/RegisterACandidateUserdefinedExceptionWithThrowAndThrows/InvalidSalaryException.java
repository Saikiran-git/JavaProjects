package RegisterACandidateUserdefinedExceptionWithThrowAndThrows;

@SuppressWarnings("serial")
public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String s){
        super(s);
    }
}
