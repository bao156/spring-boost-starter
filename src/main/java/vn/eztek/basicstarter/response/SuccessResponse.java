package vn.eztek.basicstarter.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SuccessResponse {

  private String successCode;

}