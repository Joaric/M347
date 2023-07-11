package com.example.demo.charSheet;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class CharSheet {
    @Id
    @SequenceGenerator(name = "char_sheet_id_sequence",
    sequenceName = "char_sheet_id_sequence"
      )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String playerName;
    private String characterName;
    private String race;
    private String characterClass;
    private int level;
    private int experiencePoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CharSheet() {
        // Default constructor
    }

    public CharSheet(String playerName, String characterName, String race, String characterClass,
                             int level, int experiencePoints, int strength, int dexterity, int constitution,
                             int intelligence, int wisdom, int charisma, Map<String, Integer> spellSlots) {
        this.playerName = playerName;
        this.characterName = characterName;
        this.race = race;
        this.characterClass = characterClass;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}