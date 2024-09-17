package com.springtest.testexam.Service;

import com.springtest.testexam.Entity.ApplicationUser;
import com.springtest.testexam.Entity.InsurancePolicy;
import com.springtest.testexam.Repositories.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InsurancePolicyService {


    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public InsurancePolicy addInsurancePolicy(InsurancePolicy policy) {
        return insurancePolicyRepository.save(policy);
    }
}
