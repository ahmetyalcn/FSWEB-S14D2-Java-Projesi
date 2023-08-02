import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Ahmet",
                new Wall(Direction.EAST),
                new Wall(Direction.SOUTH),
                new Wall(Direction.WEST),
                new Wall(Direction.NORTH),
                new Ceiling(2, PaintColor.BlUE),
                new Bed("Tek kişilik", 2,9,2,2),
                new Lamp(LampType.LAVA, true,4),
                new Wardrobe(3,5,4.5),
                new Carpet(8,7,PaintColor.GREEN));



        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());
    }


}