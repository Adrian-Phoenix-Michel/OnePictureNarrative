package com.example.one_picturenarrative.ui.login;

import android.content.Intent;

import com.example.one_picturenarrative.HomeActivity;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}
