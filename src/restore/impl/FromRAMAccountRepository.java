package restore.impl;

import restore.Account;
import restore.AccountRepository;

public final class FromRAMAccountRepository implements AccountRepository {
    private DefaultAccount [] accounts = {
            new DefaultAccount("test@mail.cos", true),
            new DefaultAccount("test1@mail.cos", false),
            new DefaultAccount("test2@mail.cos", false),
    };
    @Override
    public Account findByEmail(String email) {
        for(DefaultAccount account : accounts){
            if(email.equals(account.getEmail())){
                return account;
            }
        }
        return null;
    }

    @Override
    public void update(Account account) {

    }
}
