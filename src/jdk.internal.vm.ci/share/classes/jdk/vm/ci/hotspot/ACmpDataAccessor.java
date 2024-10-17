package jdk.vm.ci.hotspot;

public interface ACmpDataAccessor {
    SingleTypeEntry getLeft();

    SingleTypeEntry getRight();

    void setDeoptClassCheck();
    void setDeoptNullCheck();
}
