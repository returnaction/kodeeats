package com.nikita.kodeeats.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserWithAddressesDto {
    private UUID id;
    private String phone;
    private String firstname;
    private String lastname;
    private String email;
    private List<AddressDto> addresses;
}
