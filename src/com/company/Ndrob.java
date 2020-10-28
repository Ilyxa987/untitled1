package com.company;

public class Ndrob {
    private int num; // числитель
    private int denom;
    private int whole;

    //служебные методы: сеттеры, геттеры, конструкторы

    public void setNum(int num) {
       this.num = num;
    }

    public void setDenom(int denom) {
        if (denom != 0)
        this.denom = denom;
        else
            this.denom = 1;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public int getWhole() {
        return whole;
    }

    //вычислительные

    public Ndrob unit(){
        Ndrob rez = new Ndrob();
        rez.whole = this.num / this.denom;
        rez.num = this.num % this.denom;
        rez.denom = this.denom;
        return rez;
    }

    public Ndrob div(Ndrob secondMn){
        Ndrob rez = new Ndrob();
        this.num += this.whole * this.denom;
        rez.num = this.num * secondMn.denom;
        rez.denom = this.denom * secondMn.num;
        rez = rez.unit();
        return rez;
    }

    public Ndrob multi(Ndrob secondMn){
        Ndrob rez = new Ndrob();
        this.num += this.whole * this.denom;
        rez.num = this.num * secondMn.num;
        rez.denom = this.denom * secondMn.denom;
        rez = rez.unit();
        return rez;
    }

    public Ndrob plus(Ndrob secondMn){
        Ndrob rez = new Ndrob();
        this.num += this.whole * denom;
        if (this.denom != secondMn.denom) {
            rez.num = this.num * secondMn.denom + secondMn.num * this.denom;
            rez.denom = this.denom * secondMn.denom;
            rez = rez.unit();
            return rez;
        }
        else {
            rez.num = this.num + secondMn.num;
            rez.denom = this.denom;
            rez = rez.unit();
            return rez;
        }
    }

    public Ndrob mine(Ndrob secondMn){
        Ndrob rez = new Ndrob();
        this.num += this.whole * this.denom;
        if (this.denom == secondMn.denom){
            rez.num = this.num - secondMn.num;
            rez.denom = this.denom;
            rez = rez.unit();
            return rez;
        }
        else{
            rez.num = this.num * secondMn.denom - secondMn.num * this.denom;
            rez.denom = this.denom * secondMn.denom;
            rez = rez.unit();
            return rez;
        }
    }

    public Ndrob red(){
        Ndrob rez = new Ndrob();
        int n = 1;
        int f;
        if (this.num < this.denom){
            f = this.num;
        }
        else{
            f = this.denom;
        }
        for (int i = f; i > 0; i--) {
            if (this.num % i == 0 && this.denom % i == 0) {
                n = i;
                break;
            }
        }
        rez.whole = this.whole;
        rez.num = this.num / n;
        rez.denom = this.denom / n;
        return rez;
    }

    // методы поддержки
    public void print(){
        if (whole == 0)
            System.out.println(num + "/" + denom);
        else if (num == 0)
            System.out.println(whole);
        else
          System.out.println(whole + " " + num + "/" + denom);
    }

    @Override
    public String toString() {
        if (whole == 0)
            return num + "/" + denom;
        else if (num == 0)
            return whole + " ";
        else
            return whole + " " + num + "/" + denom;
    }
}