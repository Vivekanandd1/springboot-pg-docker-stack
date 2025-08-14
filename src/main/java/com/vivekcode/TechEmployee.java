package com.vivekcode;

import java.util.Objects;

public class TechEmployee {

    private Integer id;
    private String Name;
    private String TechStack;

    public TechEmployee(Integer id,String Name,String TechStack) {
        this.id = id;
        this.Name = Name;
        this.TechStack = TechStack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTechStack() {
        return TechStack;
    }

    public void setTechStack(String techStack) {
        TechStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TechEmployee that = (TechEmployee) o;
        return Objects.equals(id, that.id) && Objects.equals(Name, that.Name) && Objects.equals(TechStack, that.TechStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, TechStack);
    }
}
