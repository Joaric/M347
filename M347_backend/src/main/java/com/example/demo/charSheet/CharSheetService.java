package com.example.demo.charSheet;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharSheetService {
    private final CharSheetRepository charSheetRepository;

    @Autowired
    public CharSheetService(CharSheetRepository charSheetRepository) {
        this.charSheetRepository = charSheetRepository;
    }

    public List<CharSheet> getAllCharSheets() {
        return charSheetRepository.findAll();
    }

    public void addCharSheet(CharSheetController.NewCharSheet request) {
        CharSheet charSheet= new CharSheet();
        charSheet.setPlayerName(request.playerName());
        charSheet.setCharacterClass(request.characterClass());
        charSheet.setCharacterName(request.characterName());
        charSheet.setRace(request.race());
        charSheet.setCharisma(request.charisma());
        charSheet.setConstitution(request.constitution());
        charSheet.setDexterity(request.dexterity());
        charSheet.setExperiencePoints(request.experiencePoints());
        charSheet.setIntelligence(request.intelligence());
        charSheet.setLevel(request.level());
        charSheet.setStrength(request.strength());
        charSheet.setWisdom(request.wisdom());
        charSheetRepository.save(charSheet);
    }


    public CharSheet updateCharSheet(Long id, CharSheet updatedCharSheet) {
        CharSheet charSheet = charSheetRepository.findById(id)
                .orElseThrow(() -> new CharSheetController.CharSheetNotFoundException(id));

        // Copy the updated properties to the existing character sheet
        BeanUtils.copyProperties(updatedCharSheet, charSheet, "id");

        return charSheetRepository.save(charSheet);
    }

    public void deleteCharSheet(Long id) {
        charSheetRepository.deleteById(id);
    }
}
