package Views;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Credit_card;
import Model.Wallet;

import java.util.Scanner;

public class Menu {
    private Wallet wallet;
    private Credit_card credit_card;
    private Current_costs current_costs;
    private Potential_costs potential_costs;
    private Potential_income potential_income;

    private final Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public Menu(Wallet wallet, Credit_card credit_card, Current_costs current_costs, Potential_costs potential_costs, Potential_income potential_income) {
        this.wallet = wallet;
        this.credit_card = credit_card;
        this.current_costs = current_costs;
        this.potential_costs = potential_costs;
        this.potential_income = potential_income;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Credit_card getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(Credit_card credit_card) {
        this.credit_card = credit_card;
    }

    public Current_costs getCurrent_costs() {
        return current_costs;
    }

    public void setCurrent_costs(Current_costs current_costs) {
        this.current_costs = current_costs;
    }

    public Potential_costs getPotential_costs() {
        return potential_costs;
    }

    public void setPotential_costs(Potential_costs potential_costs) {
        this.potential_costs = potential_costs;
    }

    public Potential_income getPotential_income() {
        return potential_income;
    }

    public void setPotential_income(Potential_income potential_income) {
        this.potential_income = potential_income;
    }

    public void menuController() {
        if (menu01() == 1) {
            wallet.billsSumma();
        } else if (menu02() == 2) {
            wallet.allSumma();
        } else if (menu03() == 3) {
            wallet.addBill(100);
        }
        if (menu04() == 4) {
            wallet.deleteBill(2000);
        } else if (menu05() == 5) {
            credit_card.credit_cardsSumma();

        } else if (menu06() == 6) {
            credit_card.addCredit_cards("visa", 25000);

        }
        if (menu07() == 7) {
            credit_card.deleteCredit_cards("Mastercard", 50000);
        } else if (menu08() == 8) {
            current_costs.getStr();
        } else if (menu09() == 9) {
            current_costs.getPrice();
        } else if (menu10() == 10) {
            potential_costs.getStr();
        }
        if (menu11() == 11) {
            potential_costs.getPrice();
        } else if (menu12() == 12) {
            potential_income.getPrize();
        }
        if (menu13() == 13) {
            potential_income.getSalary();
        }
    }

    public void onWallet1(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.billsSumma();

            }
            case 2 -> {
                menu02();
                wallet.allSumma();

            }
            case 3 -> {
                menu03();
                wallet.addBill(3100);

            }
            case 4 -> {
                menu04();
                wallet.deleteBill(2000);

            }
            default -> {
                System.out.println("Неверный пункт");
            }
        }

    }

    public void onWallet2(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.billsSumma();
              break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                  break;
            }
            case 3 -> {
                menu03();
                wallet.addBill(3100);
                break;
            }
            case 4 -> {
                menu04();
                wallet.deleteBill(2000);
             break;
            }
            case 5 -> {
                menu05();
                credit_card.credit_cardsSumma();
                 break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }


    }
    public void onWallet3(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.billsSumma();
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                break;
            }
            case 3 -> {
                menu03();
                wallet.addBill(3100);
                break;
            }
            case 4 -> {
                menu04();
                wallet.deleteBill(2000);
                break;
            }
            case 5 -> {
                menu05();
                credit_card.credit_cardsSumma();
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                break;
            }
            case 8 -> {
                menu08();
                current_costs.getStr();
                break;
            }
            case 9 ->{
                menu09();
                current_costs.getPrice();
                break;
            }
            case 10 ->{
                menu10();
                potential_costs.getStr();
                break;
            }
            case 11 ->{
                menu11();
                potential_costs.getPrice();
                break;
            }
            case 12 ->{
                menu12();
                potential_income.getPrize();
                break;
            }
            case 13 ->{
                menu13();
                potential_income.getSalary();
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }

    }



    public void WalletMenu1(int i){
        switch (i) {
            case 1 -> {
                menu01();
                wallet.billsSumma();

            }
            case 2 -> {
                menu02();
                wallet.allSumma();

            }
            case 3 -> {
                menu03();
                wallet.addBill(3100);

            }
            case 4 -> {
                menu04();
                wallet.deleteBill(2000);

            }
            case 5 -> {
                menu03();
                credit_card.credit_cardsSumma();
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                break;
            }
            default -> {
                System.out.println("Неверный пункт");
            }
        }
    }



    public void WalletMenu2(int i){
        switch (i) {
            case 1 -> {
                menu01();
                wallet.billsSumma();
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                break;
            }
            case 3 -> {
                menu03();
                wallet.addBill(3100);
                break;
            }
            case 4 -> {
                menu04();
                wallet.deleteBill(2000);
                break;
            }
            case 5 -> {
                menu03();
                credit_card.credit_cardsSumma();
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                break;
            }

            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }



    public void WalletMenu3(int i){
       switch (i) {
           case 1 -> {
               menu01();
               wallet.billsSumma();
               break;
           }
           case 2 -> {
               menu02();
               wallet.allSumma();
               break;
           }
           case 3 -> {
               menu03();
               wallet.addBill(3100);
               break;
           }
           case 4 -> {
               menu04();
               wallet.deleteBill(2000);
               break;
           }
           case 5 -> {
               menu05();
               credit_card.credit_cardsSumma();
               break;
           }
           case 6 -> {
               menu06();
               credit_card.addCredit_cards("Visa", 25000);
               credit_card.addCredit_cards("Mastercard", 50000);
               break;
           }
           case 7 -> {
               menu07();
               credit_card.deleteCredit_cards("Mastercard", 50000);
               break;
           }
           case 8 -> {
               menu08();
               current_costs.getStr();
               break;
           }
           case 9 ->{
               menu09();
               current_costs.getPrice();
               break;
           }
           case 10 ->{
               menu10();
               potential_costs.getStr();
               break;
           }
           case 11 ->{
               menu11();
               potential_costs.getPrice();
               break;
           }
           case 12 ->{
               menu12();
               potential_income.getPrize();
               break;
           }
           case 13 ->{
               menu13();
               potential_income.getSalary();
               break;
           }
           default -> {
               System.out.println("Неверный пункт");

           }
       }
   }
    private void menu01() {
     System.out.println("1:Открыть кошелёк");
     System.out.println("2:Получение деньги по всем кошелькам");
     System.out.println("3:Добавить редактирование информацию кошелька");
     System.out.println("4:Удаление редактирование информации кошелёк");
     onWallet1(scanner.nextInt());
    }
    private void menu02() {
        System.out.println("1: Открыть кошелёк\n" +
                 "2: Получение деньги по всем кошелькам\n"+
                 "3: Добавить редактирование информацию кошелька\n"+

                 "6:Открыть кредитную карту"+
                        "7:Получение деньги по всем картам"
                );


        onWallet2(scanner.nextInt());
    }
    private void menu03() {
        System.out.println( "1: Открыть кошелёк\n" +
                "2: Получение деньги по всем кошелькам\n"+

                "6:Открыть кредитную карту\n"+
                "7:Получение деньги по всем картам\n"+
                "8:Получение деньги по всем кошелькам картам\n"+
                "9:Добавить редактирование информацию кредитной карты\n"+

                "11: Работа со списком потенциальный затрат\n"+
                "12: Работа со списком текущих затрат\n"+
                "13: Работа со списком потенциальный доход\n");

        onWallet3(scanner.nextInt());
    }
    private void menu04() {
       System.out.println( "3: Добавить редактирование информацию кошелька\n"+
                "5:Удаление редактирование информации кошелька\n");
       onWallet1(scanner.nextInt());
    }
    private void menu05(){
        System.out.println("5:Получение деньги по всем картам");
    }
    private   void  menu06(){
      System.out.println(  "6:Открыть кредитную карту");
    }
    private void menu07(){
        System.out.println( "7:Удаление редактирование информации кошелька");
    }
    private void menu08(){

    }
    private void menu09(){

    }
    private void menu10(){
        System.out.println( "10:Удаление редактирование информации кредитной карты");
    }
    private void menu11(){
       System.out.println( "11: Работа со списком потенциальный затрат\n");
    }
    private void menu12(){

    }
    private void menu13(){

    }
}







