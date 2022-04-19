package com.study.Spring5.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java {
    private String[] sayings;
    private List<User> things;
    private Set<Integer> ints;
    private Map<String,String> techs;

    @Override
    public String toString() {
        return "Java{" +
                "sayings=" + Arrays.toString(sayings) +
                ", things=" + things +
                ", ints=" + ints +
                ", techs=" + techs +
                '}';
    }

    public void setSayings(String[] sayings) {
        this.sayings = sayings;
    }

    public void setThings(List<User> things) {
        this.things = things;
    }

    public void setInts(Set<Integer> ints) {
        this.ints = ints;
    }

    public void setTechs(Map<String, String> techs) {
        this.techs = techs;
    }
}
