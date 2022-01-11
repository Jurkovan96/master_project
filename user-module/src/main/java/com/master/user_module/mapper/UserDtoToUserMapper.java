package com.master.user_module.mapper;

import com.master.user_module.dto.UserDto;
import com.master.user_module.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "jsr300")
public interface UserDtoToUserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userRole", ignore = true)
    User map(UserDto user);
}
