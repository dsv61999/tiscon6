package com.tiscon.dto;

public class UserOrderDto {

    private String customerName;

    private String tel;

    private String email;

//    確認用メールアドレス
//    private String emailConfirm;

    private String oldPrefectureId;


    private String newPrefectureId;


    private String box;

    private String bed;

    private String bicycle;

    private String washingMachine;

    private boolean washingMachineInstallation;

    //追加
    private String month;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }


    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }


    public int getBox() {
        return Integer.parseInt(box);
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getBed() {
        return Integer.parseInt(bed);
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getBicycle() {
        return Integer.parseInt(bicycle);
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public int getWashingMachine() {
        return Integer.parseInt(washingMachine);
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(Boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
