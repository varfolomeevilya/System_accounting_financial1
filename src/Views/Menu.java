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

//    public void menuController() {
//        if (menu01() == 1) {
//            wallet.billsSumma();
//        } else if (menu02() == 2) {
//            wallet.allSumma();
//        } else if (menu03() == 3) {
//            wallet.addBill(100);
//        }
//        if (menu04() == 4) {
//            wallet.deleteBill(2000);
//        } else if (menu05() == 5) {
//            credit_card.credit_cardsSumma();
//
//        } else if (menu06() == 6) {
//            credit_card.addCredit_cards("visa", 25000);
//
//        }
//        if (menu07() == 7) {
//            credit_card.deleteCredit_cards("Mastercard", 50000);
//        } else if (menu08() == 8) {
//            current_costs.getStr();
//        }else if(menu09() == 9){
//            current_costs.getPrice();
//        }else if (menu10()==10){
//            potential_costs.getStr();
//        }
//        if(menu11()==11){
//            potential_costs.getPrice();
//        }else if (menu12()==12){
//            potential_income.getPrize();
//        }
//        if (menu13()==13){
//            potential_income.getSalary();}
//    }

}



