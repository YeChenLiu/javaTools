package bean;

import java.util.List;

public class Stduent {
    private String id;
    private String name;
    private Stduent stduent;
    private List<Stduent> list;


    public Stduent getStduent() {
        return stduent;
    }

    public void setStduent(Stduent stduent) {
        this.stduent = stduent;
    }

    public List<Stduent> getList() {
        return list;
    }

    public void setList(List<Stduent> list) {
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
