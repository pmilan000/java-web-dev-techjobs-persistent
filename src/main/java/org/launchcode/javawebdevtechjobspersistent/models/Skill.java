package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotNull
    @Size(min=25, max=255, message="Must have description longer than 25 characters")
    private String skillDescription;

    public Skill(){
        this.skillDescription = skillDescription;
    }

    public String getSkillDescription() {
        return skillDescription;
    }
    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
}