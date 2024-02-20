package com.vd.drools.service;

import com.vd.drools.request.ProvidentFundRequest;
import com.vd.drools.response.ProvidentFundResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolService {

    @Autowired
    private KieContainer kieContainer;

    public ProvidentFundResponse getResponse(ProvidentFundRequest request){
        ProvidentFundResponse response = new ProvidentFundResponse();
        response.setDepartment(request.getDepartment().toUpperCase());
        response.setExperience(request.getExperience());

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("response", response);
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println(response);

        return response;
    }
}
