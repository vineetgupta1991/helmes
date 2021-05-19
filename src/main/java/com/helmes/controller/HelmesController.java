package com.helmes.controller;

import com.helmes.model.dao.Person;
import com.helmes.model.dto.HelmesRequestDto;
import com.helmes.model.dto.HelmesResponseDto;
import com.helmes.service.HelmesService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Helmes")
@RestController
@RequestMapping("v1/helmes")
public class HelmesController {

    @Autowired
    private HelmesService helmesService;

    @ApiOperation(value = "Set employee's data")
    @ApiImplicitParam(name = "language", required = true, dataType = "string", paramType = "header", value = "", defaultValue = "eng")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Validation Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })

    @PostMapping(consumes={"application/json"})
    public HelmesResponseDto saveHelmesRecord(@RequestBody HelmesRequestDto helmesRequestDto) {
       return helmesService.saveHelmesRecord(helmesRequestDto);
    }
}
