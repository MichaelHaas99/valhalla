package jdk.vm.ci.hotspot;

public interface ACmpDataAccessor {
    public SingleTypeEntry getLeft();

    public SingleTypeEntry getRight();

    public static ACmpDataAccessor create(){
        return new HotSpotMethodData.ACmpData.ACmpDataAccessorImpl();
    }
}
