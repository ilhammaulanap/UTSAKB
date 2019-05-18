package com.example.ilham.utsakb.model;

//Nama  : Ilham Maulana Pratama
//NIM   : 10116335
//KLS   : IF 8
//TGL   : 6 Mei 2019

public class FriendModel {
    private String namaFriend;
    private String emailFriend;

    public String getNamaFriend() {
        return namaFriend;
    }

    public String getEmailFriend() {
        return emailFriend;
    }

    public void setNamaFriend(String namaFriend) {
        this.namaFriend = namaFriend;
    }

    public void setEmailFriend(String emailFriend) {
        this.emailFriend = emailFriend;
    }

    public String toString(){
        return "Nama Lengkap : " + namaFriend + "\nAlamat Email : " + emailFriend;
    }
}
