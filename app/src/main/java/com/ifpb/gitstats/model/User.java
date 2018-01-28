package com.ifpb.gitstats.model;

import java.util.ArrayList;

public class User {

    private String login;
    private ArrayList<Repositorio> repositorios;
    private ArrayList<User> followers;
    private ArrayList<User> following;
    private String perfil_URL;
    private String avatar_URL;

    public User(String login, ArrayList<Repositorio> repositorios, ArrayList<User> followers, ArrayList<User> following, String perfil_URL, String avatar_URL) {
        this.login = login;
        this.repositorios = repositorios;
        this.followers = followers;
        this.following = following;
        this.perfil_URL = perfil_URL;
        this.avatar_URL = avatar_URL;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public ArrayList<Repositorio> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(ArrayList<Repositorio> repositorios) {
        this.repositorios = repositorios;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    public String getPerfil_URL() {
        return perfil_URL;
    }

    public void setPerfil_URL(String perfil_URL) {
        this.perfil_URL = perfil_URL;
    }

    public String getAvatar_URL() {
        return avatar_URL;
    }

    public void setAvatar_URL(String avatar_URL) {
        this.avatar_URL = avatar_URL;
    }
}
