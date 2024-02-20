package com.vd.drools.contoller;

import com.vd.drools.request.ProvidentFundRequest;
import com.vd.drools.response.ProvidentFundResponse;
import com.vd.drools.service.DroolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroolController {

    @Autowired
    private DroolService droolService;

    @PostMapping("/response")
    public ResponseEntity<ProvidentFundResponse> getResponse(@RequestBody ProvidentFundRequest request){
        ProvidentFundResponse response = droolService.getResponse(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
