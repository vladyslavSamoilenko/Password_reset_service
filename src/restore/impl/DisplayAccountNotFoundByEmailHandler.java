package restore.impl;

import restore.Account;
import restore.AccountNotFoundByEmailHandler;

public class DisplayAccountNotFoundByEmailHandler implements AccountNotFoundByEmailHandler {

    @Override
    public String handle(String email) {
        return "account_not_found.html?email" + email;
    }
}
