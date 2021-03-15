package com.bankApplications.reduxBank;

public abstract class Processing implements Accounts {
    String[] names;
    public abstract String[] splitNames(String names);
   public  Processing(){}
   public Processing(String[] names){
       this.names = names;
   }


}
