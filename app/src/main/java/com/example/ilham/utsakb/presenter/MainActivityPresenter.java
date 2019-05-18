package com.example.ilham.utsakb.presenter;

import com.example.ilham.utsakb.model.FriendModel;
import com.example.ilham.utsakb.view.FriendView;

//Nama  : Ilham Maulana Pratama
//NIM   : 10116335
//KLS   : IF 8
//TGL   : 6 Mei 2019

public class MainActivityPresenter implements FriendPresenter{

    private FriendView friendView;
    private FriendModel friend = new FriendModel();

    public MainActivityPresenter (FriendView friendView){
        this.friendView = friendView;
    }

    @Override
    public void updateNamaFriend(String namaFriend) {
        friend.setNamaFriend(namaFriend);
        friendView.updateUserInfoTextView(friend.toString());

    }

    @Override
    public void updateEmailFriend(String emailFriend) {
        friend.setEmailFriend(emailFriend);
        friendView.updateUserInfoTextView(friend.toString());

    }
}
