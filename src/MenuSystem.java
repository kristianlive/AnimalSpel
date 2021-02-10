import com.company.Player;

import java.io.Serializable;

public class MenuSystem implements Serializable {

    public void animalMenu (int availableMoney, Player player){

    }
    public void foodMenu(int availableMoney, Player player) {

    }
    public void sellAnimalMenu(Player player) {

    }
    protected void playerDisplay(Player player) {
        System.out.println(player.getName());
        System.out.println("Money: " + player.getMoney());

    }
}
