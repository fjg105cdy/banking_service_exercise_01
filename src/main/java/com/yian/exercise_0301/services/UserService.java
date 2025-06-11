package com.yian.exercise_0301.services;

import com.yian.exercise_0301.dtos.PageResponseDTO;
import com.yian.exercise_0301.dtos.UserRequestDTO;
import com.yian.exercise_0301.dtos.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO getUserByEmail(String email);
    UserResponseDTO getUserById(String id);
    UserResponseDTO updateUser(String id, UserRequestDTO userRequestDTO);
    void deleteUser(String id);
    PageResponseDTO getUsersWithPagination(int pageNo, int pageSize, String sortBy, String sortDir,String searchKeyword);


}
