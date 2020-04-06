package creatationalpattern.ch07biulder;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:44 PM
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCustume() {
        actor.setCustume("白裙");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairstyle("长发飘飘");
    }
}
