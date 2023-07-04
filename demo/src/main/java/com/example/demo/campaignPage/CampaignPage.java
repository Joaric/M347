package com.example.demo.campaignPage;

import com.example.demo.charSheet.CharSheet;
import com.example.demo.notes.Notes;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Collections;
import java.util.List;

public class CampaignPage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Notes> notesList;
    private String description;
    private String title;
    private List<CharSheet> charSheetList;

    public CampaignPage(List<Notes> notesList, String description, String title, List<CharSheet> charSheetList) {
        this.notesList = notesList;
        this.description = description;
        this.title = title;
        this.charSheetList = charSheetList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Notes> getNotesList() {
        return Collections.unmodifiableList(notesList);
    }

    public void setNotesList(List<Notes> notesList) {
        this.notesList = notesList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CharSheet> getCharSheetList() {
        return Collections.unmodifiableList(charSheetList);
    }

    public void setCharSheetList(List<CharSheet> charSheetList) {
        this.charSheetList = charSheetList;
    }
}
