package vn.eztek.basicstarter.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.eztek.basicstarter.request.SigninRequest;
import vn.eztek.basicstarter.request.SignupRequest;
import vn.eztek.basicstarter.response.JwtResponse;
import vn.eztek.basicstarter.response.SuccessResponse;
import vn.eztek.basicstarter.service.AuthService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  @PostMapping("/signin")
  public ResponseEntity<JwtResponse> authenticateUser(
      @Valid @RequestBody SigninRequest signinRequest) {
    var jwtResponse = authService.authenticateUser(signinRequest);
    return ResponseEntity.ok(jwtResponse);
  }

  @PostMapping("/signup")
  public ResponseEntity<SuccessResponse> registerUser(
      @Valid @RequestBody SignupRequest signUpRequest) {
    var successResponse = authService.registerUser(signUpRequest);
    return ResponseEntity.ok(successResponse);
  }

}
