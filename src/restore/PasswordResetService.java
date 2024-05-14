package restore;

public class PasswordResetService {
    private AccountRepository accountRepository;
    private AccountNotFoundByEmailHandler accountNotFoundByEmail;
    private AccountNotActiveHandler accountNotActiveHandler;
    private VerificationCodeGenerator verificationCodeGenerator;
    private EmailService emailService;

    public String reset(String email){
        Account account = accountRepository.findByEmail(email);
        if(account == null){
            return accountNotFoundByEmail.handle(email);
        } else if (account.isNotActive()) {
            String result = accountNotActiveHandler.handle(account);
            if(result != null){
                return result;
            }
        }
        String code = verificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);
        return "passord_reset_success.html";
    }
}
