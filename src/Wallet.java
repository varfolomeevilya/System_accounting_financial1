public class Wallet { // создал класс кошелек
    private String name; // создал два поле
    private int summa;
    public Wallet(){ // создал конструктор пустой
        this.name = "Ozon";
        this.summa = 12;
    }

    public Wallet(String name, int summa) { // создал конструктор по умолчанию
        this.name = name;
        this.summa = summa;
    }
//   public boolean add(){ //добавления кошелька
//
//    }
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
        return "Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
