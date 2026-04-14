package item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;


public class PartPie extends Item {
    public PartPie() {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(99)           // 保持原来的1点饥饿值
                        .saturationMod(99f)      // 保持原来的2点饱和度
                        .alwaysEat()            // 随时可吃
                        .build())
                .stacksTo(64)               // 最大堆叠64个（或保持原样）
        );



    }
}