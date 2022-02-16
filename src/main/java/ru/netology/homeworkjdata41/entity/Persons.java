package ru.netology.homeworkjdata41.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persons {
    @EmbeddedId
    private Contact contact;

    @Column(length = 16)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private String cityOfLiving;
}
