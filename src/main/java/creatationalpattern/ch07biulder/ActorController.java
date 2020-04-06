package creatationalpattern.ch07biulder;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:47 PM
 */
public class ActorController {
    public Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCustume();

        //apply HookMethod
        if (!ab.isBareHeaded()) {
            ab.buildHairStyle();
        }
        return ab.createActor();
    }
}
