package com.palak.designpatterns.creational.builder;

class Mobile {
    String screenSize;
    String company;

    Mobile(String screenSize, String company){
        this.screenSize = screenSize;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "screenSize='" + screenSize + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    static class Builder {

        String screenSize;
        String company;

        public Builder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Mobile build(){
            return new Mobile(screenSize, company);
        }
    }
}
