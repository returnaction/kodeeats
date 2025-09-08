package com.nikita.kodeeats.mapper;

import com.nikita.kodeeats.model.dto.UserCreateRequestDto;
import com.nikita.kodeeats.model.dto.UserDto;
import com.nikita.kodeeats.model.dto.UserWithAddressesDto;
import com.nikita.kodeeats.model.entity.UserEntity;

import java.util.stream.Collectors;

public class UserMapper {
    public static UserEntity toUserEntity(UserCreateRequestDto dto){
        return UserEntity.builder()
                .phone(dto.getPhone())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .build();
    }

    public static UserDto toUserResponseDto(UserEntity entity){
        return UserDto.builder()
                .id(entity.getId())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .build();
    }

    public static UserWithAddressesDto toUserWithAddressesResponseDto(UserEntity userEntity){
        return UserWithAddressesDto.builder()
                .id(userEntity.getId())
                .phone(userEntity.getPhone())
                .firstname(userEntity.getFirstname())
                .lastname(userEntity.getLastname())
                .email(userEntity.getEmail())
                .addresses(
                        userEntity.getAddresses().stream()
                                .map(AddressMapper::toDto)
                                .collect(Collectors.toList())
                )
                .build();

    }

}
