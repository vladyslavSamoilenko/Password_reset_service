package restore.impl;

import restore.Account;

public final class DefaultAccount implements Account {
    private String email;
    private boolean active;
    private String code;

    @Override
    public boolean isNotActive() {
        return !active;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }
    public DefaultAccount(String email, Boolean active){
        this.email = email;
        this.active = active;
    }

    public String getEmail() {
        return email;
    }
}
