package com.helmes.service;

import com.helmes.mapper.HelmesMapper;
import com.helmes.model.dao.Person;
import com.helmes.model.dao.Sector;
import com.helmes.model.dto.HelmesRequestDto;
import com.helmes.model.dto.HelmesResponseDto;
import com.helmes.repository.HelmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class HelmesService {

    @Autowired
    private HelmesRepository helmesRepository;

    @Autowired
    private HelmesMapper helmesMapper;

    public HelmesResponseDto saveHelmesRecord(HelmesRequestDto helmesRequestDto) {
        Person existingPerson = helmesRepository.findByName(helmesRequestDto.getName());
        if (Objects.nonNull(existingPerson)) {
            List<Sector> sectorList = helmesMapper.dtoToEntity(helmesRequestDto.getSector());
            sectorList.forEach(sector -> sector.setPerson(existingPerson));
            existingPerson.getSector().clear();
            existingPerson.getSector().addAll(sectorList);
            return helmesMapper.entityToDto(helmesRepository.save(existingPerson));
        }
        Person person = helmesMapper.dtoToEntity(helmesRequestDto);
        person.getSector().forEach(sector -> sector.setPerson(person));
        return helmesMapper.entityToDto(helmesRepository.save(person));
    }
}
