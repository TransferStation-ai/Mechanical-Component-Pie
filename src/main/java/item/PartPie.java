import java.util.Random;


public class PartPie extends Item {
    public PartPie() {
        //这里是他的基础食物
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(1)           // 保持原来的1点饥饿值
                        .saturationMod(2f)      // 保持原来的2点饱和度
                        .alwaysEat()            // 随时可吃
                        .build())
                .stacksTo(64)               // 最大堆叠64个（或保持原样）
        );



    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        // 调用父类方法处理基础食物逻辑
        ItemStack result = super.finishUsingItem(stack, level, entity);

        // 只在服务器端执行效果给予逻辑
        if (!level.isClientSide && entity instanceof Player) {
            Player player = (Player) entity;
            Random rand = new Random();
            //这里因为奇怪的事情这个代码的实现方式发生了改变
}       entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1)); // 速度2级(amp1)/30秒(600刻)
        entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 1));    // 急迫2级/20秒(400刻)
        entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1));   // 虚弱2级/60秒(1200刻)
        return result;
    }
}

