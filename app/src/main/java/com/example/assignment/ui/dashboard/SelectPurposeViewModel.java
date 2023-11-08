package com.example.assignment.ui.dashboard;

import android.view.View;

public class SelectPurposeViewModel {
    private String purpose;

    public SelectPurposeViewModel(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
