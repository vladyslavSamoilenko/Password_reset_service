package restore.impl;

import restore.EmailService;

public final class StubEmailService implements EmailService {
    @Override
    public void sendPasswordResetEmail(String email, String code) {
        System.out.println("Send code = " + code + " to " + email + " email !");
    }
}
