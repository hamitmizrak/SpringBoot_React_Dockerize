package com.hamitmizrak.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.Map;

//LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder

// api : null olan verileri göstermesin
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

    //Field
    private int status;
    private String path;
    private String message;
    private String error;
    private Map<String,String> validationErrors;
    private Date createdDate=new Date(System.currentTimeMillis());

    //constructor parametreli
    public ApiResult(int status, String path, String message, String error) {
        this.status = status;
        this.path = path;
        this.message = message;
        this.error = error;
    }

    //constructor parametreli
    public ApiResult(int status, String path, String message) {
        this.status = status;
        this.path = path;
        this.message = message;
    }
}
