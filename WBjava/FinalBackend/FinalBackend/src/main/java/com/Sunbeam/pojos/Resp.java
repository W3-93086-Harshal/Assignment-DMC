package com.Sunbeam.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resp<T> {
    public static enum Status {
        success, error
    }
    private Status status;
    private T data;
    private String message;

    public static <T> Resp<T> success(T data) {
        return new Resp<T>(Status.success, data,"");
    }
    public static <T> Resp<T> error(String message) {
        return new Resp<T>(Status.error, null,message);
    }
}