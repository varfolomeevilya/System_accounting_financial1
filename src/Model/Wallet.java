package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wallet {
    private String name; // создал два поле
    private int summa;
    private ArrayList<Integer>billsArray= new ArrayList<>();
    private HashMap<String, Integer> credit_cards= new HashMap<>();
    public Wallet(){ // создал конструктор пустой
        this.name = "Ozon";
        this.summa = 12;
    }

    public Wallet(String name, int summa) { // создал конструктор по умолчанию
        this.name = name;
        this.summa = summa;
    }
    public void addBill(int billsSum){ // добавления список чек
        billsArray.add(billsSum);
    }
    public void deleteBill(int billsSum){
        billsArray.remove(billsSum);
    }
    public void addCredit_cards(String credit_cards, Integer summa){ // добавления кредитная карта
       this.credit_cards.put(credit_cards, summa);
    }
    public void deleteCredit_cards(String credit_cards, Integer summa){
        this.credit_cards.remove(credit_cards, summa);
    }
    public int credit_cardsSumma(){
        int sum=0;
        for (Iterator<Map.Entry<String, Integer>> iterator=credit_cards.entrySet().iterator();iterator.hasNext();){
          Map.Entry<String, Integer> pair = iterator.next();
          sum += pair.getValue();
        }
        return sum;
    }
    public int billsSumma(){
        int sum=0;
        for (int a : billsArray){
            sum+=a;
        }
        return sum;
    }
    public int allSumma(){
        return billsSumma() + credit_cardsSumma();
    }
    public String getName() { // создал гетер название
        return name;
    }

    public void setName(String name) { // создал сетер название
        this.name = name;
    }

    public int getSumma() { // создал гетер сумма
        return summa;
    }

    public void setSumma(int summa) { // создал сетер сумма
        this.summa = summa;
    }
    public void print(){
        System.out.println("Name:" + name);
        System.out.println("Summa:" + summa);
    }
    @Override
    public String toString() {
        return "Model.Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
