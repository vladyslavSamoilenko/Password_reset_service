package restore.impl;

import restore.VerificationCodeGenerator;

import java.util.Random;

public class DefaultVerificationCodeGenerator implements VerificationCodeGenerator {
    private Random random = new Random();
    private int length;

    public DefaultVerificationCodeGenerator(int length) {
        this.length = length;
    }

    public DefaultVerificationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
