package com.fribbels.model;

import com.fribbels.enums.Gear;
import com.fribbels.enums.Rank;
import com.fribbels.enums.Set;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Item {

    private Gear gear;
    private Rank rank;
    private Set set;

    private Integer enhance;
    private Integer level;

    private Stat main;
    private List<Stat> substats;

    private String name;

    private AugmentedStats augmentedStats;
    private AugmentedStats reforgedStats;

    private String id;

    private String equippedById;
    private String equippedByName;
    private String heroName;

    private boolean locked;
    private int wss;
    private int dpsWss;
    private int supportWss;
    private int combatWss;

    private String duplicateId;

    public String toString() {
        return new Gson().toJson(this);
    }

    public int getHash() {
        final HashItem hashItem = new HashItem(gear, rank, set, enhance, level, main, substats);
        return hashItem.hashCode();
    }
}
