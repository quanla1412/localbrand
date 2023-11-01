package com.localbrand.dtos.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {
	private String id;
	private UserTypeDto userType;
	@Valid
	private AccountDto account;
	@NotBlank(message = "Vui lòng chọn tên người dùng")
	private String name;
	@NotBlank(message = "Vui lòng nhập số điện thoại người dùng")
	private String phone;
	@NotBlank(message = "Vui lòng chọn giới tính người dùng")
	private boolean isMan;
	@JsonFormat(pattern="yyyy-MM-dd")
	@NotBlank(message = "Vui lòng chọn ngày sinh người dùng")
	private Date birthdate;
	@NotBlank(message = "Vui lòng nhập địa chỉ người dùng")
	private String address;
	@NotBlank(message = "Vui lòng nhập email người dùng")
	private String email;
}
