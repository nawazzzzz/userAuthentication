package com.authentication.model.dtos;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private  String userId;
    private  String name;
    private  String email;
    private String password;
    private String image;

}
