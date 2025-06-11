package com.yian.exercise_0301.mappers;

import com.yian.exercise_0301.dtos.UserRequestDTO;
import com.yian.exercise_0301.dtos.UserResponseDTO;
import com.yian.exercise_0301.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserMapper {
    public User mapToUserEntity(UserRequestDTO userRequestDTO){
        return User.builder()
                .username(userRequestDTO.getUsername())
                .email(userRequestDTO.getEmail())
                .password(userRequestDTO.getPassword())
                .build();
    }

    public UserResponseDTO mapToUserResponseDTO(User user){
        return UserResponseDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
