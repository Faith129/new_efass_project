package com.nexim.nexim.services.user;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.payload.request.SignUpRequest;

public interface UserService {

    ServiceResponse findByUsername(String username) throws ResourceNotFoundException;
    //ServiceResponse findByFullname(String fullname) throws ResourceNotFoundException;
    ServiceResponse findAll() throws ResourceNotFoundException;
    ServiceResponse findByUserId(long userId) throws ResourceNotFoundException;
    ServiceResponse updateUser(long userId, SignUpRequest dto) throws ResourceNotFoundException;
    void deleteUser(long userId);
    ServiceResponse updateUserByUsername(String username, SignUpRequest dto) throws ResourceNotFoundException;
  //  ServiceResponse deleteUser(String username) throws ResourceNotFoundException;
}
