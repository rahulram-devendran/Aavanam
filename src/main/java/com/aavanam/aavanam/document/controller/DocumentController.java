package com.aavanam.aavanam.document.controller;

import com.aavanam.aavanam.document.dto.DocumentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {
    @GetMapping("/api/document")
    public DocumentDto getDocument() {
        return new DocumentDto(
                1L,
                "D1",
                "Correct"
        );
    }

    @GetMapping("/api/documents")
    public List<DocumentDto> getDocuments() {
        return List.of(
                new DocumentDto(1L, "D1", "S"),
                new DocumentDto(2L, "D2", "F")
        );
    }
}
