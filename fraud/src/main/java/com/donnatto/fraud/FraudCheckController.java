package com.donnatto.fraud;

import com.donnatto.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        log.info("customerId: {}", customerId);
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        FraudCheckResponse fraudCheckResponse = new FraudCheckResponse(isFraudulentCustomer);
        log.info("fraud-check response: {}", fraudCheckResponse);
        return fraudCheckResponse;
    }
}
