public class Credit_card extends Wallet { // создал класс кредитная карта наследование от класса кошелька
   public Credit_card(String name, int summa){
       super(name, summa);   // есть  базовый класс  определяет конструктор
                            // то производный класс должен вызвать
   }
   public void print(){
       System.out.printf(" Name: %s \n ", getName());
       System.out.printf(" Summa %s \n", getSumma());
   }

}
