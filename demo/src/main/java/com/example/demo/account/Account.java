package com.example.demo.account;

import com.example.demo.campaignPage.CampaignPage;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Collections;
import java.util.List;

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<CampaignPage> campaignList;

    public Account() {

    }

    public Account(String name, String email, String password, List<CampaignPage> campaignList) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.campaignList = campaignList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CampaignPage> getCampaignList() {
        return Collections.unmodifiableList(campaignList);
    }

    public void setCampaignList(List<CampaignPage> campaignList) {
        this.campaignList = campaignList;
    }
}
