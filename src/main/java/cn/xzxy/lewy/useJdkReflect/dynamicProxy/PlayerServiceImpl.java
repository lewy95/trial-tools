package cn.xzxy.lewy.useJdkReflect.dynamicProxy;

public class PlayerServiceImpl implements IPlayerService{

    @Override
    public void goal() {
        System.out.println("goaling");
    }

    @Override
    public void save() {
        System.out.println("saving");
    }
}
