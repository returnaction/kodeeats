package com.nikita.kodeeats.mapper;

import com.nikita.kodeeats.model.dto.AddressDto;
import com.nikita.kodeeats.model.entity.UserAddressEntity;

public class AddressMapper {
    public static AddressDto toDto(UserAddressEntity entity){
        return AddressDto.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .street(entity.getStreet())
                .house(entity.getHouse())
                .apartment(entity.getApartment())
                .userId(entity.getUser().getId())
                .build();
    }
}
