package com.springtest.testexam.Service;

import com.springtest.testexam.Entity.ApplicationUser;
import com.springtest.testexam.Entity.InsurancePolicy;
import com.springtest.testexam.Exception.InsurancePolicyRejected;
import com.springtest.testexam.Repositories.InsurancePolicyRepository;
import com.springtest.testexam.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
public class UserService {

    private static final List<String> REJECTED_CONDITIONS = Arrays.asList("Heart", "Kidney", "Liver", "Brain", "Eyes");

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public ApplicationUser addUser(ApplicationUser user) {


        if (userRepository.existsByEmail(user.getEmail())) {
            throw new InsurancePolicyRejected("A user with this email already exists: " + user.getEmail());
        }

        String medicalConditions = user.getExistingMedicalConditions().toLowerCase();
        for (String condition : REJECTED_CONDITIONS) {
            if (medicalConditions.contains(condition.toLowerCase())) {
                throw new InsurancePolicyRejected("The following pre-existing condition can’t be covered with a new policy: " + condition);
            }
        }
        return userRepository.save(user);
    }

}
