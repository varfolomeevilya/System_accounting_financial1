package Operation;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Credit_card;
import Model.Wallet;
import Views.Menu;

public class Operation {
    private Menu menu;

    public Operation() {
    }

    public Menu menu(Wallet wallet) {
        Menu menu = new Menu();
        menu.setWallet(wallet);
        return menu;
    }

    public Menu menu(Credit_card credit_card) {
        Menu menu = new Menu();
        menu.setCredit_card(credit_card);
        return menu;
    }

    public Menu menu(Current_costs current_costs) {
        Menu menu = new Menu();
        menu.setCurrent_costs(current_costs);
        return menu;
    }

    public Menu menu(Potential_costs potential_costs) {
        Menu menu = new Menu();
        menu.setPotential_costs(potential_costs);
        return menu;
    }

    public Menu menu(Potential_income potential_income) {
        Menu menu = new Menu();
        menu.setPotential_income(potential_income);
        return menu;
    }
}

