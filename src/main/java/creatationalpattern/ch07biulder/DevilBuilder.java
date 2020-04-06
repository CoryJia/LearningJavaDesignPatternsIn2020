package creatationalpattern.ch07biulder;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:46 PM
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCustume() {
        actor.setCustume("黑衣");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairstyle("光头");
    }

    @Override
    public boolean isBareHeaded() {
        return true;
    }
}
