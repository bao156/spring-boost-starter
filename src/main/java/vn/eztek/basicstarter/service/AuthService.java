package vn.eztek.basicstarter.service;

import vn.eztek.basicstarter.request.SigninRequest;
import vn.eztek.basicstarter.request.SignupRequest;
import vn.eztek.basicstarter.response.JwtResponse;
import vn.eztek.basicstarter.response.SuccessResponse;

public interface AuthService {

  JwtResponse authenticateUser(SigninRequest signinRequest);

  SuccessResponse registerUser(SignupRequest signUpRequest);

}
