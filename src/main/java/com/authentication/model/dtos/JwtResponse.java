package com.authentication.model.dtos;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String accessToken;
    private String refreshToken;
    private UserDto user;
}
