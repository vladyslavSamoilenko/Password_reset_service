package restore;

public interface EmailService {
    void sendPasswordResetEmail(String email, String code);
}
