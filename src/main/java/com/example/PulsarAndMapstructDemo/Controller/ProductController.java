package com.example.PulsarAndMapstructDemo.Controller;

import com.example.PulsarAndMapstructDemo.Mapper.ProductMapper;
import com.example.PulsarAndMapstructDemo.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json;charset=UTF-8")
@CrossOrigin(origins = "*", maxAge = 3600)
@Validated
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/reports/projects")
    public ResponseEntity<?> getProjectReport(
            @Valid @RequestBody SearchMinistryOrDivisionWiseProjectsDTO dto
    ) {
        try {
            List<DivisionDataDTO> result = projectReportService.getProjectReport(dto);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return exceptionTask(e);
        }
    }

}
