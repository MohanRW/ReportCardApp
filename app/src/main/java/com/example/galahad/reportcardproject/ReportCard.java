package com.example.galahad.reportcardproject;

/**
 * Created by Galahad on 01/12/2016.
 */

public class ReportCard {
    private String msubject;
    private String mgrade;

    public ReportCard(String subject,String grade){
        msubject=subject;
        mgrade=grade;
    }
    public String getsubject() {
        return msubject;
    }


    public String getgrade() {
        return mgrade;
    }



    public void setMsubject(String msubject) {
        this.msubject = msubject;
    }

    public void setMgrade(String mgrade) {
        this.mgrade = mgrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "msubject='" + msubject + '\'' +
                ", mgrade='" + mgrade + '\'' +
                '}';
    }
}
