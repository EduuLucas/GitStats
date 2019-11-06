package com.ifpb.gitstats.model;

class Repositorio {

    private String name;
    private String owner;
    private String repos_URL;

    public Repositorio(String name, String owner, String repos_URL) {
        this.name = name;
        this.owner = owner;
        this.repos_URL = repos_URL;
    }

    public Repositorio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepos_URL() {
        return repos_URL;
    }

    public void setRepos_URL(String repos_URL) {
        this.repos_URL = repos_URL;
    }
}
