package com.calc.ricalc.mapper;

import com.calc.ricalc.dto.PostDTO;
import com.calc.ricalc.entity.post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
    post fromDto(PostDTO source);

    PostDTO fromModel(post source);
}
