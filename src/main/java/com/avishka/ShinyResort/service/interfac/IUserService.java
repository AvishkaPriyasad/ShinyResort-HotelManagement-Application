package com.avishka.ShinyResort.service.interfac;

import com.avishka.ShinyResort.dto.LoginRequest;
import com.avishka.ShinyResort.dto.Response;
import com.avishka.ShinyResort.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
