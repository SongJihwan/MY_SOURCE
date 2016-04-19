package designpattern.abstractfactory.exam01;

public class MonsterHomeFactory {
  public Home createHome() {
    Home h = new Home();
    h.image = "moster-home.gif";
    h.defense = 70;
    h.attack = 100;
    
    return h;
  }
}

