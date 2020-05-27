package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=25, max=255, message="Must have description longer than 25 characters")
    private String description;

    public Skill(){ }

    public String getDescription() {
        return description;
    }
    public void setDescription(String skillDescription) {
        this.description = description;
    }
}