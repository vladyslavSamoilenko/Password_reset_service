import restore.PasswordResetService;
import restore.impl.*;

public class PasswordResetServiceTest {
    private  PasswordResetService service;
    public PasswordResetServiceTest(PasswordResetService service){
       this.service = service;
    }

    public void test(String email){
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(String[] args) {
        PasswordResetServiceTest passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRAMAccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultVerificationCodeGenerator(),
                new StubEmailService()
                ));
        passwordResetServiceTest.test("test@mail.cos");
        passwordResetServiceTest.test("dfgdfgdfgt@mail.cos");
    }
}
