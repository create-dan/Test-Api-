package com.springtest.testexam.Exception;

public class InsurancePolicyRejected extends RuntimeException{

    public InsurancePolicyRejected(String message) {
        super(message);
    }
}
