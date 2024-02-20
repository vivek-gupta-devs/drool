package com.vd.drools.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProvidentFundResponse {

    private String department;
    private Integer experience;
    private String providentCut;
}
