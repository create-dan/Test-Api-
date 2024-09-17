package com.springtest.testexam.Controller;

import com.springtest.testexam.Entity.ApplicationUser;
import com.springtest.testexam.Entity.InsurancePolicy;
import com.springtest.testexam.Service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/policies")
public class InsurancePolicyController {
    @Autowired
    private InsurancePolicyService insurancePolicyService;

    @PostMapping
    public InsurancePolicy addInsurancePolicy( @RequestBody InsurancePolicy policy) {
        return insurancePolicyService.addInsurancePolicy( policy);
    }
}
