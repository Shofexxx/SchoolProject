package cz.vsb.ekf.haj0185.casino;

import java.math.BigDecimal;
import java.util.Scanner;

public class Chooser {
    Scanner sc = new Scanner(System.in);
    private BigDecimal deposit;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }
    public void run(){
        ageValidation();
    }
    public void ageValidation() {
        System.out.println("Bylo vám 18 let?");
        setAge(sc.nextInt());
        if (age < 18 && age > 0) {
            System.out.println("Nejste dostatečně starý");
        } else if (age >= 18) {
            ChooseGame();
        }else {
            System.out.println("Váš věk nemůže být zaporný");
            System.out.println("Zkuste to znova");
            ageValidation();
        }
    }
    public void ChooseGame(){
        System.out.println("Zadejte peníze, které můžete utratit");
        setDeposit(sc.nextBigDecimal());
        System.out.println("Vyberte prosím hru, kterou chcete hrát");
        String reply = sc.next();
        reply = reply.toLowerCase();
            if(reply.equals("ruleta") && reply!= null){
            System.out.println("Hraješ ruletu");
            System.out.println(getDeposit());
        }else{
            System.out.println("Neplatně zadaná hra, zadej znovu");
            ChooseGame();
        }
    }
}
