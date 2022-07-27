package com.nexim.nexim.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceResponse {
    private String message;
    private String timestamp = LocalDateTime.now().toString();
    private Object data;
    private HttpStatus status;

    public ServiceResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
