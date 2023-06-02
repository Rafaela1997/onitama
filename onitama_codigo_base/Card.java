import java.util.ArrayList;
import java.util.List;

/**
 * Classe que contém informações das cartas
 */
public class Card {
   private String name;
   private String color;
   private String position;



    public Card(String name, String color, List<Position> positions) {
    this.name = name;
    this.color = color;
    this.position = String.valueOf(new ArrayList<Position>(positions));
    }


    public String getName() {
        return name;
    }

    public Color getColor() {

        return Color.valueOf(color);
    }


    public List<Position> getPositions() {
        return new ArrayList<>(Integer.parseInt(position));
    }


    public static List<Card> createCards() {
        return card;
    }
}
