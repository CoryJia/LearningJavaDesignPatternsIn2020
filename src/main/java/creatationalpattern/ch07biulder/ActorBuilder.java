package creatationalpattern.ch07biulder;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:40 PM
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCustume();
    public abstract void buildHairStyle();

    //HookMethod
    public boolean isBareHeaded(){
        return false;
    }

    public Actor createActor(){
        return actor;
    }
}
