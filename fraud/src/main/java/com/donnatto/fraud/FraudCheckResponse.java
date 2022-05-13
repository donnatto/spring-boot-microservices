package com.donnatto.fraud;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FraudCheckResponse {
    private Boolean isFraudster;
}
