package org.example.studyweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private String username;
    private String password;
    private String image;
    private String phone;
    public Boolean state=false;

}
