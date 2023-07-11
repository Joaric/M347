package com.example.demo.charSheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/charSheets")
public class CharSheetController {
    private final CharSheetService service;
    @Autowired

    public CharSheetController(CharSheetService service) {
        this.service = service;
    }

    @GetMapping
    public List<CharSheet> getCharSheets() {
        return service.getAllCharSheets();
    }

    record NewCharSheet(
            String playerName,
            String characterName,
            String race,
            String characterClass,
            Integer level,
            Integer experiencePoints,
            Integer strength,
            Integer dexterity,
            Integer constitution,
            Integer intelligence,
            Integer wisdom,
            Integer charisma) {
    }

    @PostMapping
    public void addCharSheet(@RequestBody NewCharSheet request) {
        service.addCharSheet(request);
    }

    @DeleteMapping("{id}")
    public void deleteCharSheet(@PathVariable("id") Long id) {
        service.deleteCharSheet(id);
    }

    @PutMapping("/{id}")
    public CharSheet updateCharSheet(@PathVariable Long id, @RequestBody CharSheet updatedCharSheet) {
        return service.updateCharSheet(id, updatedCharSheet);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class CharSheetNotFoundException extends RuntimeException {
        public CharSheetNotFoundException(Long id) {
            super("Character sheet not found with id: " + id);
        }
    }
}
