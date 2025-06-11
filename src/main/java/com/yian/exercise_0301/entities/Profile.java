package com.yian.exercise_0301.entities;

import com.yian.exercise_0301.common.AbstractEntity;
import jakarta.persistence.Table;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Table(name="PROFILE")
public class Profile extends AbstractEntity {
    private String job;
    private String age;
    private String gender;
    private String hobby;
    private String qualification;

}
