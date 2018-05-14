package com.daveco.thewalkingdog;

public class Mascota {

    private int foto_perro;
    private int img_hueso;
    private String nombre_mascota;
    private int num_likes;
    private int img_bonemitlikes;

    public Mascota(int foto_perro, int img_hueso, String nombre_mascota, int num_likes, int img_bonemitlikes){
        this.foto_perro = foto_perro;
        this.img_hueso = img_hueso;
        this.nombre_mascota = nombre_mascota;
        this.num_likes = num_likes;
        this.img_bonemitlikes = img_bonemitlikes;
    }

    public int getFoto_perro() {
        return foto_perro;
    }

    public void setFoto_perro(int foto_perro) {
        this.foto_perro = foto_perro;
    }

    public int getImg_hueso() {
        return img_hueso;
    }

    public void setImg_hueso(int img_hueso) {
        this.img_hueso = img_hueso;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getNum_likes() {
        return num_likes;
    }

    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public int getImg_bonemitlikes() {
        return img_bonemitlikes;
    }

    public void setImg_bonemitlikes(int img_bonemitlikes) {
        this.img_bonemitlikes = img_bonemitlikes;
    }

}
