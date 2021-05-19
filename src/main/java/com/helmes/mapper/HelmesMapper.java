package com.helmes.mapper;

import com.helmes.model.dao.Person;
import com.helmes.model.dao.Sector;
import com.helmes.model.dto.HelmesRequestDto;
import com.helmes.model.dto.HelmesResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HelmesMapper {

    Person dtoToEntity(HelmesRequestDto helmesRequestDto);

    List<Sector> dtoToEntity(List<HelmesRequestDto.Sector> sectors);

    HelmesResponseDto entityToDto(Person person);
}
