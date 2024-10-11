package jdk.vm.ci.hotspot;

public interface ACmpDataAccessor {
    SingleTypeEntry getLeft();

    SingleTypeEntry getRight();

    void setDeoptClassCheck();
    void setDeoptNullCheck();

    static ACmpDataAccessor create(){
        return new HotSpotMethodData.ACmpData.ACmpDataAccessorImpl();
    }
}
