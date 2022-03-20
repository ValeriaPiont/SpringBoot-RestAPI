package com.example.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
public class SameEmailResponse {
    private int status;
    private String massage;
    private Object data;

    public SameEmailResponse(int status, String massage) {
        this.status = status;
        this.massage = massage;
    }
}
